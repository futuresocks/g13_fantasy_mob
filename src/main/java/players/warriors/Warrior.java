package players.warriors;

import behaviours.IWeapon;
import enemies.Enemy;
import players.Player;

public abstract class Warrior extends Player {

    private IWeapon weapon;

    public Warrior(String name, int healthPoints, IWeapon weapon) {
        super(name, healthPoints);
        this.weapon = weapon;
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public void attack(Enemy enemy){
        this.weapon.attack(enemy);
    }
}
