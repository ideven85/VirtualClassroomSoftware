package com.cleo.StudentManagementSystem.domain;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Order {

    private String name;

    private String description;


}
