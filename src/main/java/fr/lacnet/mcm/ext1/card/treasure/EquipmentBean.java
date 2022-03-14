package fr.lacnet.mcm.ext1.card.treasure;

/**
 * @author jlacroix
 */
public class EquipmentBean extends AbstractTreasure {
	/**
	 * @param aName
	 *            String
	 */
	public EquipmentBean(final String aName) {
		super(aName);
	}

	/**
	 * (non-Javadoc).
	 * 
	 * @return boolean
	 * @see Treasure#isEquipment()
	 */
	public final boolean isEquipment() {
		return true;
	}

	/**
	 * (non-Javadoc).
	 * 
	 * @return boolean
	 * @see Treasure#isPotion()
	 */
	public final boolean isPotion() {
		return false;
	}
}
