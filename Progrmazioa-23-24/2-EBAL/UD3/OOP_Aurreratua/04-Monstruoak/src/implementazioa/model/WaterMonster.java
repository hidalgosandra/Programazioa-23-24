package implementazioa.model;

public class WaterMonster implements Monstruosoa {
    /** Constructs a WaterMonster instance with the given name */
    String name;
    public WaterMonster(String name) {
        this.name = name;
    }

    /** Subclass provides actual implementation for attack() */
    @Override
    public String attack() {
        return getIrudia() + "   Attack with water!";
    }

    public char getIrudia() {
        return '\u26C8';
    }
}