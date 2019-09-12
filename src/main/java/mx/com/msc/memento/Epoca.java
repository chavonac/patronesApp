package mx.com.msc.memento;

public class Epoca {
    private String tiempo;

    public void establecerTiempo(String tiempo){
        this.tiempo = tiempo;
        System.out.println("Establecer tiempo a: " + this.tiempo);
    }

    public Memento guardarMemento(){
        System.out.println("Guardando punto de tiempo en Memento");
        return new Memento(this.tiempo);
    }

    public void restablecerMemento(Memento memento){
        this.tiempo = memento.getTiempoGuardado();
        System.out.println("Tiempo recuperado de Memento: " + this.tiempo);
    }

}