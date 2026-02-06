package model;

public package com.vehicle.service.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ownerName;
    private String vehicleNumber;
    private String model;
    private String type;
}
 {
    
}
