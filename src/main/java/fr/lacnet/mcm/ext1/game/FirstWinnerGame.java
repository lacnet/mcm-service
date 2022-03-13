package fr.lacnet.mcm.ext1.game;

import java.util.Iterator;

import fr.lacnet.mcm.ext1.player.Player;

/**
 * 
 * @author jlacroix
 * 
 */
class FirstWinnerGame extends AbstractGame {
	/**
	 * {@inheritDoc}
	 */
	public Boolean isOver() {
		final Iterator<Player> playerIt = getPlayers().iterator();
		boolean result = !playerIt.hasNext();

		while (playerIt.hasNext() && !result) {
			result = getMinCharacterLevel2WinParty().equals(
					playerIt.next().getCharacterLevel());
		}

		return result;
	}
}
