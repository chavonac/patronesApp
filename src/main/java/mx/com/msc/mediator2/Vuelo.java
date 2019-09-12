package mx.com.msc.mediator2;

public class Vuelo implements Orden {
    private IATCMediator atcMediator;

    public Vuelo(IATCMediator atcMediator) {
        this.atcMediator = atcMediator;
    }

    public void getReady() {
        System.out.println("Listo para aterrizar");
    }

    @Override
    public void aterrizar() {
        if (atcMediator.aterrizajeExitoso()) {
            System.out.println("Aterrizaje exitoso");
            atcMediator.setEstatusAterrizaje(true);
        } else {
            System.out.println("Esperando aterrizaje");
        }
    }

}