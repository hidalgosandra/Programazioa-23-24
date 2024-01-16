package herentziamemberabstraktoekin.model;

/**
 * The superclass Monster defines the expected common behaviors for its
 * subclasses.
 */
public abstract class Monster {
    // private instance variable
    private String name;

    /** Constructs a Monster instance with the given name */
    public Monster(String name) {
        this.name = name;
    }

    /** Defines a common behavior called attack() for all its subclasses */
    public abstract String attack();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        String mota = "";
        if (this instanceof FireMonster) {
            mota = "FireMonster";
        } else if (this instanceof WaterMonster) {
            mota = "WaterMonster";
        } else if (this instanceof StoneMonster) {
            mota = "StoneMonster";
        }
        return mota + "[" + name + "]";
    }
}