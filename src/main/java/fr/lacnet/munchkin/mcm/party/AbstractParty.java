package fr.lacnet.munchkin.mcm.party;

import java.util.ArrayList;
import java.util.List;

import fr.lacnet.munchkin.mcm.CharacterLevel;
import fr.lacnet.munchkin.mcm.dealer.Dealer;
import fr.lacnet.munchkin.mcm.player.Player;

/**
 * 
 * @author jlacroix
 * 
 */
public abstract class AbstractParty implements Party {

	/**
	 * 
	 */
	private Dealer dealer;

	/**
	 * 
	 */
	private final List<Player> players = new ArrayList<Player>(
			getMaxNbPlayers());

	/**
	 * {@inheritDoc} Getter of the property <tt>dealer</tt>
	 * 
	 * @return Returns the dealer.
	 */
	public Dealer getDealer() {
		return dealer;
	}

	/**
	 * {@inheritDoc}
	 */
	public Integer getMaxNbPlayers() {
		// TODO Auto-generated method stub
		return 6;
	}

	/**
	 * {@inheritDoc}
	 */
	public CharacterLevel getMinCharacterLevel2WinParty() {
		// TODO Auto-generated method stub
		final CharacterLevel level = null;
		level.setValue(10);

		return level;
	}

	/**
	 * {@inheritDoc}
	 */
	public Integer getMinGoldValue4OneLevelUp() {
		// TODO Auto-generated method stub
		return 1000;
	}

	/**
	 * {@inheritDoc}
	 */
	public Integer getMinNbPlayers() {
		// TODO Auto-generated method stub
		return 3;
	}

	/**
	 * {@inheritDoc}
	 */
	public Integer getMinValue4SuccededRunaway() {
		// TODO Auto-generated method stub
		return 4;
	}

	/**
	 * {@inheritDoc}
	 */
	public List<Player> getPlayers() {
		return players;
	}

	/**
	 * Setter of the property <tt>dealer</tt>
	 * 
	 * @param dealer
	 *            The dealer to set.
	 */
	public void setDealer(final Dealer dealer) {
		this.dealer = dealer;
	}
}
