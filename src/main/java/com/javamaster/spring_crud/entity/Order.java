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
    private String owner;

    @Column
    private String address;

    @Column(name = "local_date")
    private LocalDate localDate;
    @Column(name = "problem_type")
    private String problemType;
    @Column
    private String operator;
    @Column
    private int userId;
    @Column
    private String electric;

}
