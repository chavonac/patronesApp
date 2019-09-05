package mx.com.msc.mains;

import mx.com.msc.prototype.TV;
import mx.com.msc.prototype.TvPrototype;

public class PrototypeMain {

    public static void main(String[] args) throws Exception {
        TvPrototype tvp = new TvPrototype();

        System.out.println("----------------------Clone 1 de Tv Plasma-----------------------");
        TV tvPlasma = (TV) tvp.prototipo("Plasma");
        System.out.println(tvPlasma);
        System.out.println(tvPlasma.getPrecio());
        System.out.println(tvPlasma.getColor());
        System.out.println(tvPlasma.getMarcas());

        System.out.println("---------------------Clone 1 de Tv LCD---------------------------");

        TV tvLcd = (TV) tvp.prototipo("LCD");
        System.out.println(tvLcd);
        System.out.println(tvLcd.getPrecio());
        System.out.println(tvLcd.getColor());
        System.out.println(tvLcd.getMarcas());

        System.out.println("---------------------Clone 2 de Tv LCD---------------------------");

        TV tvLcd2 = (TV) tvp.prototipo("LCD");
        System.out.println(tvLcd2);
        System.out.println(tvLcd2.getPrecio());
        System.out.println(tvLcd2.getColor());
        System.out.println(tvLcd2.getMarcas());
    }

}
