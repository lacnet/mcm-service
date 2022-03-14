package fr.lacnet.mcm.ext1.card.door.race;

/**
 * @author jlacroix
 */
public class DwarfBean extends AbstractRace {
	/**
	 * @param aName
	 *            String
	 */
	public DwarfBean(final String aName) {
		super(aName);
	}

	/**
	 * (non-Javadoc)
	 */
	public final boolean isDwarf() {
		return true;
	}

	/**
	 * (non-Javadoc)
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
