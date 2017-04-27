package com.alevat.apeman.api.dto;

import com.google.common.base.MoreObjects;
import com.google.common.base.MoreObjects.ToStringHelper;

public abstract class AbstractDto {

    @Override
    public String toString() {
        ToStringHelper toStringHelper = MoreObjects.toStringHelper(this);
        addToStringFields(toStringHelper);
        return toStringHelper.toString();
    }

    protected abstract void addToStringFields(ToStringHelper toStringHelper);

}
