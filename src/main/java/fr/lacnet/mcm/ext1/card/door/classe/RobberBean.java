package fr.lacnet.mcm.ext1.card.door.classe;

/**
 * @author jlacroix
 */
public class RobberBean extends AbstractClass {
	/**
	 * @param aName
	 *            String
	 */
	public RobberBean(final String aName) {
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
		return true;
	}

	/**
	 * (non-Javadoc).
	 */
	public final boolean isWarrior() {
		return false;
	}
}
