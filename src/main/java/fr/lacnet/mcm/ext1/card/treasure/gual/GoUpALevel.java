package fr.lacnet.mcm.ext1.card.treasure.gual;

import fr.lacnet.mcm.ext1.card.treasure.Treasure;
import fr.lacnet.mcm.ext1.card.treasure.gual.exception.UnsupportedGoUpALevelException;
import fr.lacnet.mcm.ext1.player.Player;

/**
 * 
 * @author jlacroix
 * 
 */
public interface GoUpALevel extends Treasure {

	/**
	 * 
	 * @param player Player
	 * @throws UnsupportedGoUpALevelException unsuppported operation
	 */
	void oneMOre(final Player player) throws UnsupportedGoUpALevelException;
}
