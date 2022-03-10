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
	 * @return
	 */
	Dealer getDealer();

	/**
	 * 
	 * @return
	 */
	Integer getMaxNbPlayers();

	/**
	 * 
	 * @return
	 */
	CharacterLevel getMinCharacterLevel2WinParty();

	/**
	 * 
	 * @return
	 */
	Integer getMinGoldValue4OneLevelUp();

	/**
	 * 
	 * @return
	 */
	Integer getMinNbPlayers();

	/**
	 * 
	 * @return
	 */
	Integer getMinValue4SuccededRunaway();

	/**
	 * 
	 * @return
	 */
	List<Player> getPlayers();

	/**
	 * 
	 * @return
	 */
	Boolean isOver();
}
