package fr.lacnet.mcm.ext1.card.door.curse;

import fr.lacnet.mcm.ext1.card.door.Door;
import fr.lacnet.mcm.ext1.player.Player;

/**
 * 
 * @author jlacroix
 * 
 */
public interface Curse extends Door {

	/**
	 * 
	 * @param player
	 *            who will be cursed
	 */
	void apply(Player player);

	/**
	 *
	 */
	void doCurse();
}
