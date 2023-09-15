package model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//import javax.persistence.Column;
//import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="Salario")
public class Salario implements Serializable {

	
	private int salario_base;   
    private int comision;

	public int getSalario_base() {
		return salario_base;
	}

	public void setSalario_base(int salario_base) {
		this.salario_base = salario_base;
	}

	public int getComision() {
		return comision;
	}

	public void setComision(int comision) {
		this.comision = comision;
	}
    
 
}