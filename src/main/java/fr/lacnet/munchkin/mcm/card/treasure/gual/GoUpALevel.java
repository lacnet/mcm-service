package fr.lacnet.munchkin.mcm.card.treasure.gual;

import fr.lacnet.munchkin.mcm.card.treasure.Treasure;
import fr.lacnet.munchkin.mcm.card.treasure.gual.exception.UnsupportedGoUpALevelException;
import fr.lacnet.munchkin.mcm.player.Player;

/**
 * 
 * @author jlacroix
 * 
 */
public interface GoUpALevel extends Treasure {

	/**
	 * 
	 * @param player
	 * @throws UnsupportedGoUpALevelException
	 */
	void oneMOre(final Player player) throws UnsupportedGoUpALevelException;
}
