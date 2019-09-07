/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.msc.mains;
import mx.com.msc.builder.Constructor.BuilderCoche;
import mx.com.msc.builder.ConstructorConcreto.ConstructorCocheBase;
import mx.com.msc.builder.ConstructorConcreto.ConstructorCocheFull;
import mx.com.msc.builder.ConstructorConcreto.ConstructorCocheMedio;
import mx.com.msc.builder.Director.Director;
import mx.com.msc.builder.Estructura.Coche;

/**
 *
 * @author Aspire
 */
public class BuilderMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Director objFabrica = new Director();
        
        BuilderCoche base = new ConstructorCocheBase();
        BuilderCoche medio = new ConstructorCocheMedio();
        BuilderCoche full = new ConstructorCocheFull();
        
        objFabrica.construir(base);
        Coche cocheBase = base.getCoche();
        
        objFabrica.construir(medio);
        Coche cocheMedio = medio.getCoche();
        
        objFabrica.construir(full);
        Coche cocheFull = full.getCoche();
        
        mostrarCaracteristicas(cocheBase);
        mostrarCaracteristicas(cocheMedio);
        mostrarCaracteristicas(cocheFull);
    }
    
    public static void mostrarCaracteristicas(Coche coche){
        System.out.println("Motor: " + coche.getMotor());
        System.out.println("Carrocería: " + coche.getCarroceria());
        System.out.println("Elevalunas eléctrico: " + coche.getElevalunasElec());
        System.out.println("Aire acondicionado: " + coche.getAireAcond());
        
        System.out.println("============================================");
    }
    
}
