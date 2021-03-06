package players.magicusers;

import enemies.Enemy;
import players.Player;
import players.magicusers.Spell;

public abstract class MagicUser extends Player {
    private Spell spell;
    private MythicalCreature mythicalCreature;

    public MagicUser(String name, int healthPoints) {
        super(name, healthPoints);
        this.spell = spell;
        this.mythicalCreature = mythicalCreature;
    }

    public void attack(Enemy enemy){};

}
