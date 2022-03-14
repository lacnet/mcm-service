package fr.lacnet.mcm.ext1.card.door.classe;

/**
 * @author jlacroix
 */
public class PriestBean extends AbstractClass {
	/**
	 * @param aName
	 *            String
	 */
	public PriestBean(final String aName) {
		super(aName);
	}

	/**
	 * (non-Javadoc).
	 */
	public final boolean isPriest() {
		return true;
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
		return false;
	}
}
