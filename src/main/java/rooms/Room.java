package rooms;

import enemies.Enemy;
import players.Player;
import roomStuffMagicBeans.Treasure;

public class Room {

    private Treasure treasure;
    private Enemy enemy;
    private Player player;

    public Room(Treasure treasure, Enemy enemy) {
        this.treasure = treasure;
        this.enemy = enemy;
        this.player = null;
    }

    public Treasure getTreasure() {
        return treasure;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public Player getPlayer() {
        return player;
    }

    public void setTreasure(Treasure treasure) {
        this.treasure = treasure;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
