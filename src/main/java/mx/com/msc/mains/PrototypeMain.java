package mx.com.msc.mains;

import mx.com.msc.prototype.TV;
import mx.com.msc.prototype.TvPrototype;

public class PrototypeMain {

    public static void main(String[] args) throws Exception{
        TvPrototype tvp = new TvPrototype();
        TV tv = (TV) tvp.prototipo("Plasma");
        System.out.println(tv.getPrecio());
        System.out.println(tv.getColor());
    }

}
