package com.carinfo.domain;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table
@Data
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String model;
    private String gos_number;
    private int mileage;
}
