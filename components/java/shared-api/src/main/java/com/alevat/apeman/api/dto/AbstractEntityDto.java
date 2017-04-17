package com.alevat.apeman.api.dto;

import com.google.common.base.MoreObjects.ToStringHelper;

import java.util.UUID;

public class AbstractEntityDto extends AbstractDto {

    private UUID uuid;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    protected void addToStringFields(ToStringHelper toStringHelper) {
        toStringHelper.add("uuid", uuid);
    }

}
