package fr.lacnet.mcm.ext4.card.door.race;

import fr.lacnet.mcm.ext1.card.door.monster.Monster;

/**
 * @author jla
 */
public abstract class AbstractRace extends fr.lacnet.mcm.ext1.card.door.race.AbstractRace implements Race {

    protected boolean isGnone;

    protected AbstractRace(final String name) {
        super(name);
    }

    public boolean isGnoneFor(Monster aMonster) {
        return isGnone;
    }

}
