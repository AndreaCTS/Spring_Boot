package Controller;
import java.util.ArrayList;
import java.util.List;

	public class EmpleadoController {
	    private List<Empleado> listaEmpleados;

	    public EmpleadoController() {
	        // Inicializar la lista de empleados
	        listaEmpleados = new ArrayList<>();
	    }

	    // Método para agregar un empleado
	    public void agregarEmpleado(Empleado empleado) {
	        listaEmpleados.add(empleado);
	    }

	    // Método para actualizar la información de un empleado
	    public void actualizarEmpleado(Empleado empleadoAntiguo, Empleado empleadoNuevo) {
	        if (listaEmpleados.contains(empleadoAntiguo)) {
	            int indice = listaEmpleados.indexOf(empleadoAntiguo);
	            listaEmpleados.set(indice, empleadoNuevo);
	        }
	    }

	    // Método para eliminar un empleado
	    public void eliminarEmpleado(Empleado empleado) {
	        listaEmpleados.remove(empleado);
	    }

	    // Método para obtener una lista de todos los empleados
	    public List<Empleado> obtenerTodosLosEmpleados() {
	        return listaEmpleados;
	    }

	    // Otros métodos según las necesidades de tu aplicación
	}

}
