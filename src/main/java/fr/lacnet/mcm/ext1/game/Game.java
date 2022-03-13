package fr.lacnet.mcm.ext1.game;

import java.util.List;

import fr.lacnet.mcm.ext1.dealer.Dealer;
import fr.lacnet.mcm.ext1.player.CharacterLevel;
import fr.lacnet.mcm.ext1.player.Player;

/**
 * 
 * @author jlacroix
 * 
 */
public interface Game {

	/**
	 * 
	 * @return Dealer
	 */
	Dealer getDealer();

	/**
	 * 
	 * @return Integer
	 */
	Integer getMaxNbPlayers();

	/**
	 * 
	 * @return CharacterLevel
	 */
	CharacterLevel getMinCharacterLevel2WinParty();

	/**
	 * 
	 * @return Integer
	 */
	Integer getMinGoldValue4OneLevelUp();

	/**
	 * 
	 * @return Integer
	 */
	Integer getMinNbPlayers();

	/**
	 * 
	 * @return Integer
	 */
	Integer getMinValue4SuccededRunaway();

	/**
	 * 
	 * @return List<Player>
	 */
	List<Player> getPlayers();

	/**
	 * 
	 * @return Boolean
	 */
	Boolean isOver();
}
