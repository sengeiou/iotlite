package com.dj.iotlite.api.dto;

import lombok.Data;

@Data
public class OrganizationListDto implements BaseDto {
    Long id;
    String name;
    String description;
}
