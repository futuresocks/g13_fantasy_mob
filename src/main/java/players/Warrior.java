package players;

public abstract class Warrior extends Player{

    private Weapon weapon;


    public Warrior(String name, int healthPoints) {
        super(name, healthPoints);


        this.weapon = weapon;


    }

    public Weapon getWeapon() {
        return weapon;
    }
}
