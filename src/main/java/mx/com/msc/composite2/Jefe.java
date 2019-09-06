package mx.com.msc.composite2;

import java.util.ArrayList;
import java.util.List;

public class Jefe implements Empleado {
    private String nombre;
    private String puesto;

    public Jefe(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
    }

    private List<Empleado> subordinados = new ArrayList<Empleado>();

    public void agregaSubordinado(Empleado emp) {
        subordinados.add(emp);
    }

    public void eliminaSubordinado(Empleado emp) {
        subordinados.remove(emp);
    }

    @Override
    public void muestraInfoEmpleado() {
        System.out.println(nombre.concat(" - ").concat(puesto));
        if (subordinados.size() > 0) {
            System.out.println("Subordinados de: ".concat(nombre));
        }
        for (Empleado emp : subordinados) {
            emp.muestraInfoEmpleado();
        }
    }
}