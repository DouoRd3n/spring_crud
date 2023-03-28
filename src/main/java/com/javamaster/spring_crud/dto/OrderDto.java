package com.javamaster.spring_crud.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {


    private int id;

    private String owner;

    private String address;

    private LocalDate localDate;

    private String problemType;

    private String operator;

    private int userId;

    private String electric;



}
