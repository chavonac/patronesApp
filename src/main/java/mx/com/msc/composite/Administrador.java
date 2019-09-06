package mx.com.msc.composite;

public class Administrador implements Empleado {
    String clave;
    String nombre;
    int antiguedad;

    public Administrador(String clave, String nombre, int antiguedad) {
        this.clave = clave;
        this.nombre = nombre;
        this.antiguedad = antiguedad;
    }

    @Override
    public void muestraDetalleEmpleado() {
        System.out.println(clave.concat(" ").concat(nombre));
    }
}