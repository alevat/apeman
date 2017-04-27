package com.alevat.apeman.entities;

import com.google.common.base.MoreObjects;
import com.google.common.base.MoreObjects.ToStringHelper;

import java.util.Objects;
import java.util.UUID;

abstract class AbstractEntity {

    public abstract UUID getUuid();

    public abstract void setUuid(UUID uuid);

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        AbstractEntity entity = (AbstractEntity) object;
        return Objects.equals(getUuid(), entity.getUuid());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getUuid());
    }

    @Override
    public String toString() {
        ToStringHelper toStringHelper = MoreObjects.toStringHelper(this);
        toStringHelper.add("uuid", getUuid());
        addToStringFields(toStringHelper);
        return toStringHelper.toString();
    }

    protected void addToStringFields(ToStringHelper toStringHelper) {
        // default is no-op, subclass to add fields to string representation
    }

}
