package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name="Departamento")
public class Departamento{
    @Id
    private Integer idDepartamento;
    
    private String nombreDept;
    private String descDept;
    
    private List<Empleado> empleados;

    public Integer getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Integer idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNombreDept() {
        return nombreDept;
    }

    public void setNombreDept(String nombreDept) {
        this.nombreDept = nombreDept;
    }

    public String getDescDept() {
        return descDept;
    }

    public void setDescDept(String descDept) {
        this.descDept = descDept;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
    
    
    
}