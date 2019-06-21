package com.sourceinformation.scaffold.dto;

import lombok.Data;

@Data
public class TaskDTO {
    private Long id;
    private String name;
    private Boolean done;
}
