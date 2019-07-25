package players.warriors;

import behaviours.IWeapon;

public class Knight extends Warrior {

    private int armour;

    public Knight(String name, IWeapon weapon) {
        super(name, 40, weapon);
        this.armour = 30;
    }

    public int getArmour() {
        return armour;
    }

    public void addToArmour(int armour) {
        this.armour += armour;
    }

    public void reduceHealth(int damage){
        if(damage > this.armour){
            int damageInflicted = damage - this.armour;
            this.armour = 0;
            int newHp = this.getHealthPoints() - damageInflicted;
            this.setHealthPoints(newHp);
        }
    }
}
