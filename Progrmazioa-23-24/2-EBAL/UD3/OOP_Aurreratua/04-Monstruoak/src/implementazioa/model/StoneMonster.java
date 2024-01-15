package implementazioa.model;

public class StoneMonster implements Monstruosoa {
    /** Constructs a StoneMonster instance with the given name */
    String name;
    public StoneMonster(String name) {
        this.name = name;
    }

    /** Subclass provides actual implementation for attack() */
    @Override
    public String attack() {
        return getIrudia() + "   Attack with stones!";
    }

    public char getIrudia() {
        return '\u26F0';
    }

}