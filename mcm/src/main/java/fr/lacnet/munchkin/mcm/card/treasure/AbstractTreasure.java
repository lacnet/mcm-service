package fr.lacnet.munchkin.mcm.card.treasure;

import fr.lacnet.munchkin.mcm.card.AbstractCard;

/**
 * @author jlacroix
 */
public abstract class AbstractTreasure extends AbstractCard implements Treasure {

	/**
	 * (non-Javadoc).
	 * 
	 * @return boolean
	 * @see fr.lacnet.munchkin.mdm.card.Card#isDoor()
	 */
	public final boolean isDoor() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * (non-Javadoc).
	 * 
	 * @return boolean
	 * @see fr.lacnet.munchkin.mdm.card#isTreasure()
	 */
	public final boolean isTreasure() {
		// TODO Auto-generated method stub
		return true;
	}
}
