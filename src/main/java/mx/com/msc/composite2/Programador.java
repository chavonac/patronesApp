package mx.com.msc.composite2;

public class Programador implements Empleado {
    private String clave;
    private String nombre;

    public Programador(String clave, String nombre) {
        this.clave = clave;
        this.nombre = nombre;
    }

    @Override
    public void muestraInfoEmpleado() {
        System.out.println(clave.concat(" - ").concat(nombre));
    }

}