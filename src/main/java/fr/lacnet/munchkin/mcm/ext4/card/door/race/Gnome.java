package fr.lacnet.munchkin.mcm.ext4.card.door.race;

import fr.lacnet.munchkin.mcm.card.door.race.Race;

/**
 * @author jla
 */
public class Gnome extends AbstractRace {

    /**
     *
     * @param name
     */
    public Gnome(String name) {
        isGnone = true;
    }

    /**
     * (non-Javadoc).
     *
     * @return boolean
     * @see Race#isDwarf
     */
    public final boolean isDwarf() {
        return true;
    }

    /**
     * (non-Javadoc).
     *
     * @return boolean
     * @see Race#isElf
     */
    public final boolean isElf() {
        return false;
    }

    /**
     * (non-Javadoc).
     *
     * @return boolean
     * @see Race#isHobbit
     */
    public final boolean isHobbit() {
        return false;
    }
}
