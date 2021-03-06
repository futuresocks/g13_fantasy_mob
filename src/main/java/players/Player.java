package players;

import enemies.Enemy;
import roomStuffMagicBeans.Treasure;

import java.util.ArrayList;

public abstract class Player {

    private String name;
    private int healthPoints;
    private ArrayList<Treasure> treasures;

    public Player(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.treasures = new ArrayList<Treasure>();
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public ArrayList<Treasure> getTreasures() {
        return treasures;
    }

    public void addTreasure(Treasure treasure){
        this.treasures.add(treasure);
    }


    public void reduceHealth(int damage) {
        this.healthPoints -= damage;
    }


    public int countOfTreasure() {
        return this.treasures.size();
    }

    public void setHealthPoints(int newHp){
        this.healthPoints = newHp;
    };

    public abstract void attack(Enemy enemy);
}
