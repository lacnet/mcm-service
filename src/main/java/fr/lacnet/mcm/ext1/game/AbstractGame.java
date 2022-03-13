package fr.lacnet.mcm.ext1.game;

import java.util.ArrayList;
import java.util.List;

import fr.lacnet.mcm.ext1.dealer.Dealer;
import fr.lacnet.mcm.ext1.player.CharacterLevel;
import fr.lacnet.mcm.ext1.player.Player;

/**
 * 
 * @author jlacroix
 * 
 */
abstract class AbstractGame implements Game {

	/**
	 * 
	 */
	private Dealer dealer;

	/**
	 * 
	 */
	private final List<Player> players = new ArrayList<>(
			getMaxNbPlayers());

	/**
	 * {@inheritDoc}
	 */
	public Dealer getDealer() {
		return dealer;
	}

	/**
	 * {@inheritDoc}
	 */
	public Integer getMaxNbPlayers() {
		return 6;
	}

	/**
	 * {@inheritDoc}
	 */
	public CharacterLevel getMinCharacterLevel2WinParty() {
		return new CharacterLevel() {

			@Override
			public int compareTo(CharacterLevel o) {
				return 0;
			}

			@Override
			public Integer getValue() {
				return 10;
			}

			@Override
			public void setValue(Integer characterLevel) {
				System.out.println("setValue");
			}
		};
	}

	/**
	 * {@inheritDoc}
	 */
	public Integer getMinGoldValue4OneLevelUp() {
		return 1000;
	}

	/**
	 * {@inheritDoc}
	 */
	public Integer getMinNbPlayers() {
		return 3;
	}

	/**
	 * {@inheritDoc}
	 */
	public Integer getMinValue4SuccededRunaway() {
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
