package fr.lacnet.munchkin.mcm.party;

import java.util.List;

import fr.lacnet.munchkin.mcm.CharacterLevel;
import fr.lacnet.munchkin.mcm.dealer.Dealer;
import fr.lacnet.munchkin.mcm.player.Player;

/**
 * 
 * @author jlacroix
 * 
 */
public interface Party {

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
