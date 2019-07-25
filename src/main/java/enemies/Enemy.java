package enemies;

public abstract class Enemy {

    private String name;
    private int healthPoints;

    public Enemy(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void reduceHealth(int damage) {
        this.healthPoints -= damage;
    }

    public boolean isDead(){
        return this.healthPoints == 0;
    };
}
