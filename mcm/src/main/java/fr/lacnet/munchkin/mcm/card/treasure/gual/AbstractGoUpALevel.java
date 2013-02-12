package fr.lacnet.munchkin.mcm.card.treasure.gual;

import fr.lacnet.munchkin.mcm.card.treasure.gual.exception.UnsupportedGoUpALevelException;
import fr.lacnet.munchkin.mcm.player.Player;

/**
 * 
 * @author jlacroix
 * 
 */
public abstract class AbstractGoUpALevel implements GoUpALevel {

	/**
	 * {@inheritDoc}
	 */
	public final void oneMOre(final Player player)
			throws UnsupportedGoUpALevelException {

		if (player.getCharacterLevel().getValue() < 9) {
			player.gainLevel(1);
		} else {
			throw new UnsupportedGoUpALevelException();
		}
	}
}
