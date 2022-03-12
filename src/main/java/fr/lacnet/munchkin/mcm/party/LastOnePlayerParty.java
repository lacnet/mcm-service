package fr.lacnet.munchkin.mcm.party;

import java.util.Iterator;

import fr.lacnet.munchkin.mcm.player.Player;

/**
 * 
 * @author jlacroix
 * 
 */
public class LastOnePlayerParty extends AbstractParty {
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
