/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.msc.builder.Estructura;

/**
 *
 * @author Aspire
 */
public class Coche {
    private String motor = "";
    private String carroceria = "";
    private Boolean elevalunasElec = false;
    private Boolean aireAcond = false;
    
    public Coche(){
        
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public Boolean getElevalunasElec() {
        return elevalunasElec;
    }

    public void setElevalunasElec(Boolean elevalunasElec) {
        this.elevalunasElec = elevalunasElec;
    }

    public Boolean getAireAcond() {
        return aireAcond;
    }

    public void setAireAcond(Boolean aireAcond) {
        this.aireAcond = aireAcond;
    }
    
}
//ejemplo
//Que onda quique
