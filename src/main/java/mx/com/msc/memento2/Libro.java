package mx.com.msc.memento2;

public class Libro {
    private int paginaActual;

    public void irPagina(int pagina) {
        this.paginaActual = pagina;
        System.out.println("Agregando marcador en página: " + this.paginaActual);
    }

    public Memento guardarMarcador() {
        System.out.println("Marcador guardado");
        return new Memento(this.paginaActual);
    }

    public void recuperarPagina(Memento m) {
        this.paginaActual = m.getMarcadorPagina();
        System.out.println("Volver a página: " + this.paginaActual);
    }
}