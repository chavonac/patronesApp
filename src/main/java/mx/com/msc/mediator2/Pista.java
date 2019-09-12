package mx.com.msc.mediator2;

public class Pista implements Orden {
    private IATCMediator atcMediator;

    public Pista(IATCMediator atcMediator) {
        this.atcMediator = atcMediator;
    }

    @Override
    public void aterrizar() {
        System.out.println("Permiso para aterrizar concedido");
        atcMediator.setEstatusAterrizaje(true);
    }
}