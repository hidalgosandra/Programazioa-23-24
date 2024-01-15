package implementazioa.model;

public class FireMonster implements Monstruosoa {
    /** Constructs a FireMonster with the given name */
    String name;
    public FireMonster(String name) {
        this.name = name;
    }

    /** Subclass provides actual implementation for attack() */
    @Override
    public String attack() {
        return getIrudia() + "   Attack with fire!";
    }

    public char getIrudia() {
        return '\u2668';
    }
}