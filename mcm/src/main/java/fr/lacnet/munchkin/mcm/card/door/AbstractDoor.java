package fr.lacnet.munchkin.mcm.card.door;

import fr.lacnet.munchkin.mcm.card.AbstractCard;

/**
 * 
 * @author jlacroix
 * 
 */
public abstract class AbstractDoor extends AbstractCard implements Door {

	/**
	 * {@inheritDoc}
	 */
	public Boolean isImmediat() {
		return Boolean.FALSE;
	}

	/**
	 * (non-Javadoc).
	 * 
	 * @return boolean
	 * @see fr.lacnet.munchkin.mdm.card.Card#isDoor()
	 */
	public final boolean isDoor() {
		// TODO Auto-generated method stub
		return true;
	}

	/**
	 * (non-Javadoc).
	 * 
	 * @return boolean
	 * @see fr.lacnet.munchkin.mdm.card.Card#isTreasure()
	 */
	public final boolean isTreasure() {
		// TODO Auto-generated method stub
		return false;
	}
}
