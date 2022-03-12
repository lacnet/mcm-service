package fr.lacnet.munchkin.mcm.card.treasure.item;

import fr.lacnet.munchkin.mcm.card.treasure.Treasure;

/**
 * 
 * @author jlacroix
 * 
 */
public interface Item extends Treasure {

	/**
	 * 
	 * @return the value of this items in terms of Gold.
	 */
	Integer getGoldValue();
}
