package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Empleado;

public class EmpleadoRepository {
    private List<Empleado> listaEmpleados;

    public EmpleadoRepository() {

        listaEmpleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
    }

    public void actualizarEmpleado(Empleado empleadoAntiguo, Empleado empleadoNuevo) {
        if (listaEmpleados.contains(empleadoAntiguo)) {
            int indice = listaEmpleados.indexOf(empleadoAntiguo);
            listaEmpleados.set(indice, empleadoNuevo);
        }
    }

    public void eliminarEmpleado(Empleado empleado) {
        listaEmpleados.remove(empleado);
    }

    public Empleado obtenerEmpleadoPorIndice(int indice) {
        if (indice >= 0 && indice < listaEmpleados.size()) {
            return listaEmpleados.get(indice);
        }
        return null;
    }

    public List<Empleado> obtenerTodosLosEmpleados() {
        return listaEmpleados;
    }

    // Otros métodos según las necesidades de tu aplicación (por ejemplo, cargar y guardar desde una base de datos)
}
