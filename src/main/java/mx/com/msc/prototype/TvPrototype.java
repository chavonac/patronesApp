package mx.com.msc.prototype;

import java.util.HashMap;
import mx.com.msc.prototype.LCD;
import mx.com.msc.prototype.Plasma;
import mx.com.msc.prototype.TV;

public class TvPrototype {
    private final HashMap<String, TV> prototipos = new HashMap<>();

    public TvPrototype() {
        Plasma plasma = new Plasma("Sony", 21, "Negro", 399.99, 90, 0.05);
        LCD lcd = new LCD("LG", 24, "GRIS", 599.99, 290);

        prototipos.put("Plasma", plasma);
        prototipos.put("LCD", lcd);
    }

    public Object prototipo(String tipo) throws CloneNotSupportedException {
        return prototipos.get(tipo).clone();
    }

}