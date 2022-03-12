package fr.lacnet.munchkin.mcm.party;

import java.util.Iterator;

import fr.lacnet.munchkin.mcm.player.Player;

/**
 * 
 * @author jlacroix
 * 
 */
public class FirstWinningPlayerParty extends AbstractParty {
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
