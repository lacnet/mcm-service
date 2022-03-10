package fr.lacnet.munchkin.mcm.card.door.bonus;

import fr.lacnet.munchkin.mcm.card.door.AbstractDoor;

/**
 * @author jlacroix
 */
public class BonusBean extends AbstractDoor implements Bonus {
	/**
     *
     */
	private int level, price, size;

	/**
	 * @param aName
	 *            String
	 */
	public BonusBean(final String aName) {
		// super(aName);
		// TODO Auto-generated constructor stub
	}

	/**
	 * (non-Javadoc).
	 * 
	 * @return boolean
	 * @see fr.lacnet.munchkin.mdm.card.donjon.Donjon#isBonus()
	 */
	public final boolean isBonus() {
		// TODO Auto-generated method stub
		return true;
	}

	/**
	 * (non-Javadoc).
	 * 
	 * @return boolean
	 * @see fr.lacnet.munchkin.mdm.card.donjon.Donjon#isClass()
	 */
	public final boolean isClass() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * (non-Javadoc).
	 * 
	 * @return boolean
	 * @see fr.lacnet.munchkin.mdm.card.donjon.Donjon#isCurse()
	 */
	public final boolean isCurse() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * (non-Javadoc).
	 * 
	 * @return boolean
	 * @see fr.lacnet.munchkin.mdm.card.donjon.Donjon#isMonster()
	 */
	public final boolean isMonster() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * (non-Javadoc).
	 * 
	 * @return boolean
	 * @see fr.lacnet.munchkin.mdm.card.donjon.Donjon#isRace()
	 */
	public final boolean isRace() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * (non-Javadoc).
	 * 
	 * @return int
	 * @see Bonus#getLevel()
	 */
	public final int getLevel() {
		// TODO Auto-generated method stub
		return level;
	}

	/**
	 * @param aLevel
	 *            int
	 */
	public final void setLevel(final int aLevel) {
		level = aLevel;
	}

	/**
	 * (non-Javadoc).
	 * 
	 * @return int
	 * @see Bonus#getPrice()
	 */
	public final int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	/**
	 * @param aPrice
	 *            int
	 */
	public final void setPrice(final int aPrice) {
		price = aPrice;
	}

	/**
	 * (non-Javadoc).
	 * 
	 * @return int
	 * @see Bonus#getSize()
	 */
	public final int getSize() {
		// TODO Auto-generated method stub
		return size;
	}

	/**
	 * @param aSize
	 *            int
	 */
	public final void setSize(final int aSize) {
		size = aSize;
	}
}
