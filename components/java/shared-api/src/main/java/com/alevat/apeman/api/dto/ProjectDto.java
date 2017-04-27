package com.alevat.apeman.api.dto;

import com.google.common.base.MoreObjects.ToStringHelper;

public class ProjectDto extends AbstractEntityDto {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected void addToStringFields(ToStringHelper toStringHelper) {
        super.addToStringFields(toStringHelper);
        toStringHelper.add("name", name);
    }
}
