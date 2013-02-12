package fr.lacnet.munchkin.mcm.dealer;

import java.util.List;

import fr.lacnet.munchkin.mcm.card.Card;
import fr.lacnet.munchkin.mcm.card.door.Door;
import fr.lacnet.munchkin.mcm.card.treasure.Treasure;
import fr.lacnet.munchkin.mcm.card.treasure.item.Item;
import fr.lacnet.munchkin.mcm.party.Party;

/**
 * 
 * @author jlacroix
 * 
 */
public interface Dealer {

	/**
	 * 
	 * @param nb2Draw
	 * @return
	 */
	List<Door> dealDoors(final Integer nb2Draw);

	/**
	 * 
	 * @param nb2Draw
	 * @return
	 */
	List<Treasure> dealTreasures(final Integer nb2Draw);

	/**
	 * 
	 * @param doors
	 *            Door cards to discards
	 * @return
	 */
	void discardDoors(final List<Door> doors);

	/**
	 * 
	 * @param treasures
	 *            Treasure cards to discards
	 * @return
	 */
	void discardTreasures(final List<Treasure> treasures);

	/**
	 * 
	 * @param card
	 * @return
	 */
	Card getFirstTrashedCardLike(final Card card);

	/**
	 * 
	 * @return
	 */
	Party getParty();

	/**
	 * 
	 * @param items
	 * @return
	 */
	Integer sellItems(final List<Item> items);
}
