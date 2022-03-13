package fr.lacnet.mcm.ext1.card.treasure;

import fr.lacnet.mcm.ext1.card.Card;

/**
 * 
 * @author jlacroix
 * 
 */
public interface Treasure extends Card {
	/**
	 * @return boolean
	 */
	boolean isPotion();

	/**
	 * @return boolean
	 */
	boolean isEquipment();
}
