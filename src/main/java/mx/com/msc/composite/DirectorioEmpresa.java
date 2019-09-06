package mx.com.msc.composite;

import java.util.ArrayList;
import java.util.List;

public class DirectorioEmpresa implements Empleado {
    private List<Empleado> listaEmpleados = new ArrayList<Empleado>();

    public void agregarEmpleado(Empleado emp) {
        listaEmpleados.add(emp);
    }

    public void eliminaEmpleado(Empleado emp) {
        listaEmpleados.remove(emp);
    }

    @Override
    public void muestraDetalleEmpleado() {
        for (Empleado emp : listaEmpleados) {
            emp.muestraDetalleEmpleado();
        }
    }

}