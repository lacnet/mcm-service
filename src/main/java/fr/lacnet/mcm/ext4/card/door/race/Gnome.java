package fr.lacnet.mcm.ext4.card.door.race;

/**
 * @author jla
 */
public class Gnome extends AbstractRace {

    /**
     *
     * @param name String
     */
    public Gnome(String name) {
        super(name);

        isGnone = true;
    }

    /**
     * (non-Javadoc).
     */
    public final boolean isDwarf() {
        return true;
    }

    /**
     * (non-Javadoc).
     */
    public final boolean isElf() {
        return false;
    }

    /**
     * (non-Javadoc).
     */
    public final boolean isHobbit() {
        return false;
    }
}
