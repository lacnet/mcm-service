package fr.lacnet.mcm.ext1.dealer;

import java.util.List;

import fr.lacnet.mcm.ext1.card.Card;
import fr.lacnet.mcm.ext1.card.door.Door;
import fr.lacnet.mcm.ext1.card.treasure.Treasure;
import fr.lacnet.mcm.ext1.card.treasure.item.Item;
import fr.lacnet.mcm.ext1.game.Game;

/**
 * 
 * @author jlacroix
 * 
 */
public interface Dealer {

	/**
	 * 
	 * @param nb2Draw Integer
	 * @return List<Door>
	 */
	List<Door> dealDoors(final Integer nb2Draw);

	/**
	 * 
	 * @param nb2Draw Integer
	 * @return List<Treasure>
	 */
	List<Treasure> dealTreasures(final Integer nb2Draw);

	/**
	 * 
	 * @param doors
	 *            Door cards to discards
	 */
	void discardDoors(final List<Door> doors);

	/**
	 * 
	 * @param treasures
	 *            Treasure cards to discards
	 */
	void discardTreasures(final List<Treasure> treasures);

	/**
	 * 
	 * @param card Card
	 * @return Card
	 */
	Card getFirstTrashedCardLike(final Card card);

	/**
	 * 
	 * @return Party
	 */
	Game getParty();

	/**
	 * 
	 * @param items List<Item>
	 * @return Integer
	 */
	Integer sellItems(final List<Item> items);
}
