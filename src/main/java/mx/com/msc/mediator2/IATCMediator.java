package mx.com.msc.mediator2;

public interface IATCMediator {
    public void registrarPista(Pista pista);

    public void registrarVuelo(Vuelo vuelo);

    public boolean aterrizajeExitoso();

    public void setEstatusAterrizaje(boolean estatus);
}