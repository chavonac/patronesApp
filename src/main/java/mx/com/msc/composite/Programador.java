package mx.com.msc.composite;

public class Programador implements Empleado {
    private String clave;
    private String nombre;
    private int antiguedad;

    public Programador(String clave, String nombre, int antiguedad) {
        this.clave = clave;
        this.nombre = nombre;
        this.antiguedad = antiguedad;
    }

    @Override
    public void muestraDetalleEmpleado() {
        System.out.println(clave.concat(" ").concat(nombre).concat(" ") + antiguedad);
    }

}