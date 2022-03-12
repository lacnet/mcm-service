package fr.lacnet.munchkin.mcm.card.door.race;

/**
 * @author jlacroix
 */
public class ElfBean extends AbstractRace {
	/**
	 * @param aName
	 *            String
	 */
	public ElfBean(final String aName) {
		super(aName);
	}

	/**
	 * (non-Javadoc).
	 * 
	 * @return boolean
	 * @see Race#isDwarf
	 */
	public final boolean isDwarf() {
		return false;
	}

	/**
	 * (non-Javadoc).
	 * 
	 * @return boolean
	 * @see Race#isElf
	 */
	public final boolean isElf() {
		return true;
	}

	/**
	 * (non-Javadoc).
	 */
	public final boolean isHobbit() {
		return false;
	}
}
