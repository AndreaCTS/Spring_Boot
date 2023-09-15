package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name="Proyecto")

public class Empleado {

	    private String nombre;
	    private String apellido;
	    private String direccion;
	    private String numeroTelefono;


	    public Empleado(String nombre, String apellido, String direccion, String numeroTelefono) {
	    	
	        this.nombre = nombre;
	        this.apellido = apellido;
	        this.direccion = direccion;
	        this.numeroTelefono = numeroTelefono;
	    }
	    
	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getApellido() {
	        return apellido;
	    }

	    public void setApellido(String apellido) {
	        this.apellido = apellido;
	    }

	    public String getDireccion() {
	        return direccion;
	    }

	    public void setDireccion(String direccion) {
	        this.direccion = direccion;
	    }

	    public String getNumeroTelefono() {
	        return numeroTelefono;
	    }

	    public void setNumeroTelefono(String numeroTelefono) {
	        this.numeroTelefono = numeroTelefono;
	    }
}
