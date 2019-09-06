package mx.com.msc.mains;

import mx.com.msc.composite2.Jefe;
import mx.com.msc.composite2.Programador;

public class CompositeMain2 {
    public static void main(String[] args) {

        Jefe j1 = new Jefe("Salvador", "Programador");
        j1.agregaSubordinado(new Programador("001", "Andrea"));
        j1.agregaSubordinado(new Programador("002", "Adrian"));

        Jefe j2 = new Jefe("Sergio", "Programador");
        j2.agregaSubordinado(new Programador("003", "Diego"));
        j2.agregaSubordinado(new Programador("004", "Quique"));
        
        Jefe j3 = new Jefe("Iván", "Programador/Administrador");
        j3.agregaSubordinado(new Programador("005", "Gera"));
        j3.agregaSubordinado(j1);
        j3.agregaSubordinado(j2);
        



        j3.muestraInfoEmpleado();

    }
}