package players.magicusers;

import players.Player;
import players.magicusers.Spell;

public abstract class MagicUser extends Player {
    private Spell spell;

    public MagicUser(String name, int healthPoints) {
        super(name, healthPoints);
        this.spell = spell;
    }

}
