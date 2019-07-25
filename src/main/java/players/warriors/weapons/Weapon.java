package players.warriors.weapons;

import behaviours.IWeapon;
import enemies.Enemy;

public abstract class Weapon implements IWeapon {

    private int damage;

    public Weapon(int damage){
        this.damage = damage;
    }

    public void attack(Enemy enemy){
        enemy.reduceHealth(this.damage);
    }
}
