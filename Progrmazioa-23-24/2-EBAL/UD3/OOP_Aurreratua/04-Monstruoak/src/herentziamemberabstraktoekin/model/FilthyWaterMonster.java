package herentziamemberabstraktoekin.model;

public class FilthyWaterMonster extends WaterMonster {

    public FilthyWaterMonster(String name) {
        super(name);
    }

    /** Subclass provides actual implementation for attack() */
    @Override
    public String attack() {
        return "Attack with dirty water!";
    }

}
