package fr.lacnet.mcm.ext1.card.treasure;

/**
 * @author jlacroix
 */
public class PotionBean extends AbstractTreasure {
	/**
	 * @param aName
	 *            String
	 */
	public PotionBean(final String aName) {
		super(aName);
	}

	/**
	 * (non-Javadoc).
	 */
	public final boolean isEquipment() {
		return false;
	}

	/**
	 * (non-Javadoc).
	 */
	public final boolean isPotion() {
		return true;
	}
}
