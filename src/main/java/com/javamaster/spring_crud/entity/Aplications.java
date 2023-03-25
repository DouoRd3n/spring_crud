package com.javamaster.spring_crud.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "aplications_table")
@Data
@NoArgsConstructor
public class Aplications {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String owner;

    @Column
    private String address;

    @Column
    private LocalDate localDate;
    @Column(name = "problem_type")
    private String problemType;
    @Column
    private String operator;
    @Column
    private String telefon;
    @Column
    private String electric;
}
