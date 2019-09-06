package mx.com.msc.mains;

import mx.com.msc.composite.Administrador;
import mx.com.msc.composite.DirectorioEmpresa;
import mx.com.msc.composite.Programador;

public class CompositeMain1 {
    public static void main(String[] args) {
        Programador p1 = new Programador("001", "Yessi", 4);
        Programador p2 = new Programador("002", "Chavon", 5);

        DirectorioEmpresa directorioProgramadores = new DirectorioEmpresa();
        directorioProgramadores.agregarEmpleado(p1);
        directorioProgramadores.agregarEmpleado(p2);

        Administrador a1 = new Administrador("003", "Nash", 6);
        Administrador a2 = new Administrador("004", "Ponsh", 7);

        DirectorioEmpresa directorioAdmin = new DirectorioEmpresa();
        directorioAdmin.agregarEmpleado(a1);
        directorioAdmin.agregarEmpleado(a2);

        DirectorioEmpresa directorio = new DirectorioEmpresa();
        directorio.agregarEmpleado(directorioProgramadores);
        directorio.agregarEmpleado(directorioAdmin);
        directorio.agregarEmpleado(new Programador("005", "Checks", 2));
        directorio.muestraDetalleEmpleado();
    }
}