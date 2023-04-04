package com.javamaster.spring_crud.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "order_table")
@Data
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String plumes;
    @Column
    private String referral;
    @Column
    private String objectName;
    @Column
    private String objectAdress;
    @Column(name = "application_date")
    private LocalDate applicationDate;
    @Column(name = "the_reason_for_the_application")
    private String theReasonForTheApplication;
    @Column(name = "who_created_the_application")
    private String whoCreatedTheApplication;
    @Column(name = "electrician_that_accepted_the_application")
    private String electricianThatAcceptedTheApplication;
    @Column(name = "application_result")
    private String applicationResult;
    @Column
    private String note;

    @Column
    private int userId;

}
