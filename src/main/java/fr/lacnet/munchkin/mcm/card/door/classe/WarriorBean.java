package fr.lacnet.munchkin.mcm.card.door.classe;

/**
 * @author jlacroix
 */
public class WarriorBean extends AbstractClass {
	/**
	 * @param aName
	 *            String
	 */
	public WarriorBean(final String aName) {
		super(aName);
	}

	/**
	 * (non-Javadoc).
	 */
	public final boolean isPriest() {
		return false;
	}

	/**
	 * (non-Javadoc).
	 */
	public final boolean isRobber() {
		return false;
	}

	/**
	 * (non-Javadoc).
	 */
	public final boolean isWarrior() {
		return true;
	}
}
