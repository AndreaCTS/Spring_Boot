package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Entity
public class Departamento{
    @Id
    private Integer idDepartamento;
    
    private String nombreDept;
    private String descDept;
    private List<Empleado>
    
}