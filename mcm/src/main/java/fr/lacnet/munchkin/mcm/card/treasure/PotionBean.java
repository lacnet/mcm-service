package fr.lacnet.munchkin.mcm.card.treasure;

/**
 * @author jlacroix
 */
public class PotionBean extends AbstractTreasure {
	/**
	 * @param aName
	 *            String
	 */
	public PotionBean(final String aName) {
		// super(aName);
		// TODO Auto-generated constructor stub
	}

	/**
	 * (non-Javadoc).
	 * 
	 * @return boolean
	 * @see Treasure#isEquipment()
	 */
	public final boolean isEquipment() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * (non-Javadoc).
	 * 
	 * @return boolean
	 * @see Treasure#isPotion()
	 */
	public final boolean isPotion() {
		// TODO Auto-generated method stub
		return true;
	}
}
