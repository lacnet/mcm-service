package fr.lacnet.mcm.ext1.card.treasure.gual;

import fr.lacnet.mcm.ext1.card.treasure.gual.exception.UnsupportedGoUpALevelException;
import fr.lacnet.mcm.ext1.player.Player;

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
