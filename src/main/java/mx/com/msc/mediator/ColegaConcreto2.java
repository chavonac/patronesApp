package mx.com.msc.mediator;

public class ColegaConcreto2 extends Colega {

    public ColegaConcreto2(IMediador m) {
        this.setMediador(m);
    }

    @Override
    public void recibir(String mensaje) {
        System.out.println("ColegaConcreto2: " + mensaje);
    }
}