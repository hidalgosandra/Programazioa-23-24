package implementazioa.model;

public class FilthyWaterMonster extends WaterMonster {

    public FilthyWaterMonster(String name) {
        super(name);
    }

    /** Subclass provides actual implementation for attack() */
    @Override
    public String attack() {
        return getIrudia() + "   Attack with dirty water!";
    }

    public char getIrudia() {
        return '\u2623';
    }

}
