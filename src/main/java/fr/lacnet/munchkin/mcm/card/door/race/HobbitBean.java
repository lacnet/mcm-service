package fr.lacnet.munchkin.mcm.card.door.race;

/**
 * @author jlacroix
 */
public class HobbitBean extends AbstractRace {
	/**
	 * @param aName
	 *            String
	 */
	public HobbitBean(final String aName) {
		super(aName);
	}

	/**
	 * (non-Javadoc).
	 */
	public final boolean isDwarf() {
		return false;
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
		return true;
	}
}
