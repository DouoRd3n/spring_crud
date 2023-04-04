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

    private String plumes;

    private String referral;

    private String objectName;

    private String objectAdress;

    private LocalDate applicationDate;

    private String theReasonForTheApplication;

    private String whoCreatedTheApplication;

    private String electricianThatAcceptedTheApplication;

    private String applicationResult;

    private String note;

    private int userId;


}
