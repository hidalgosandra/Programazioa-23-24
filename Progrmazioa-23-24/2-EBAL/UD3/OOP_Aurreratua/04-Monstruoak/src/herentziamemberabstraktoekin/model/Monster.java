package herentziamemberabstraktoekin.model;
import herentziamemberabstraktoekin.model.Hiztegia;

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

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Monster other = (Monster) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
}