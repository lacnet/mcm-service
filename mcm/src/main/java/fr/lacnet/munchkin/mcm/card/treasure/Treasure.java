package fr.lacnet.munchkin.mcm.card.treasure;

import fr.lacnet.munchkin.mcm.card.Card;

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
