package mx.com.msc.mains;
import mx.com.msc.observer.*;

public class ObserverMain{
    public static void main(String[] args){
        UnObservado objObservado = new UnObservado();

        UnObservador yessi = new UnObservador("Yessi");
        objObservado.agregarObservador(yessi);

        UnObservador chavon = new UnObservador("Chavon");
        objObservado.agregarObservador(chavon);

        UnObservador checo = new UnObservador("Checo");
        objObservado.agregarObservador(checo);
    }
}