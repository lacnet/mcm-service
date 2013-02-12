package fr.lacnet.munchkin.mcm.ext4.card.door.race;

import fr.lacnet.munchkin.mcm.card.door.race.Race;

/**
 * 
 * @author jla
 *
 */
public class GnomeBean extends AbstractRace {

	/**
	 * 
	 * @param name
	 */
	protected GnomeBean(String name) {
//		super(name);
		// TODO Auto-generated constructor stub
		isGnone = true;
	}

    /**
     * (non-Javadoc).
     *
     * @return boolean
     * @see Race#isDwarf
     */
    public final boolean isDwarf() {
        // TODO Auto-generated method stub
        return true;
    }

    /**
     * (non-Javadoc).
     *
     * @return boolean
     * @see Race#isElf
     */
    public final boolean isElf() {
        // TODO Auto-generated method stub
        return false;
    }

    /**
     * (non-Javadoc).
     *
     * @return boolean
     * @see Race#isHobbit
     */
    public final boolean isHobbit() {
        // TODO Auto-generated method stub
        return false;
    }
}
