package com.carinfo.entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "cars")
@Data
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String model;
    private String gos_number;
    private int mileage;

    private Long driverID;
}
