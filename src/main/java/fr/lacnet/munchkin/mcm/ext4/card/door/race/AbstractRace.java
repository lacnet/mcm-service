package fr.lacnet.munchkin.mcm.ext4.card.door.race;

import fr.lacnet.munchkin.mcm.card.door.AbstractDoor;
import fr.lacnet.munchkin.mcm.card.door.monster.Monster;

/**
 * @author jla
 */
public abstract class AbstractRace extends fr.lacnet.munchkin.mcm.card.door.race.AbstractRace implements Race {
    protected boolean isGnone;

    public boolean isGnoneFor(Monster aMonster) {
        return isGnone;
    }

}
