/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.msc.builder.Constructor;
import mx.com.msc.builder.Estructura.Coche;


/**
 *
 * @author Aspire
 */
public abstract class BuilderCoche {
    protected Coche coche;
    
    public Coche getCoche(){
        return coche;
    }
    
    public void crearNuevoCoche(){
        this.coche = new Coche();
    }
    
    public abstract void construirMotor();
    public abstract void construirCarroceria();
    public abstract void construirAireAcond();
    public abstract void construirElevalunas();
}
