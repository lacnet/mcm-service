package fr.lacnet.munchkin.mcm.card.door.curse;

import fr.lacnet.munchkin.mcm.card.door.Door;
import fr.lacnet.munchkin.mcm.player.Player;

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
