package Model;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name="Proyecto")
public class Proyecto {

  private Long id;

  private String nombre;

  private String descripcion;

  private Date fechaInicio;

  private Date fechaFin;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

public Date getFechaInicio() {
	return fechaInicio;
}

public void setFechaInicio(Date fechaInicio) {
	this.fechaInicio = fechaInicio;
}

public Date getFechaFin() {
	return fechaFin;
}

public void setFechaFin(Date fechaFin) {
	this.fechaFin = fechaFin;
}

  

}