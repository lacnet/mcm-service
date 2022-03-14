package fr.lacnet.mcm.ext1.game;

import java.util.Iterator;

import fr.lacnet.mcm.ext1.player.Player;

/**
 * 
 * @author jlacroix
 * 
 */
class LastWinnerGame extends AbstractGame {
	/**
	 * {@inheritDoc}
	 */
	public Boolean isOver() {
		final Iterator<Player> playerIt = getPlayers().iterator();
		int result = 0;

		while (playerIt.hasNext() && getPlayers().size() == result + 1) {
			if (getMinCharacterLevel2WinParty().equals(
					playerIt.next().getCharacterLevel())) {
				result++;
			}
		}

		return getPlayers().size() == result + 1;
	}
}
