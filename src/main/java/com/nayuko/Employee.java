package com.nayuko;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

itest

@Entity
@Table(name = "employees")
@Data
public class Employee {

    @Id
    @GeneratedValue
    private UUID id;
    private String name;

    public Employee() {
    }

    public Employee(String name){
        this.name = name;
    }
}
