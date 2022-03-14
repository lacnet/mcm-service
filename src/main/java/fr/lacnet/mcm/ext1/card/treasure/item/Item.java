package fr.lacnet.mcm.ext1.card.treasure.item;

import fr.lacnet.mcm.ext1.card.treasure.Treasure;

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
