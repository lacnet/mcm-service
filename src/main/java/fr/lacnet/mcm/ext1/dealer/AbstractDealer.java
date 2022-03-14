package fr.lacnet.mcm.ext1.dealer;

import java.util.List;

import fr.lacnet.mcm.ext1.card.Card;
import fr.lacnet.mcm.ext1.card.door.Door;
import fr.lacnet.mcm.ext1.card.treasure.Treasure;
import fr.lacnet.mcm.ext1.card.treasure.item.Item;
import fr.lacnet.mcm.ext1.dealer.deck.Deck;
import fr.lacnet.mcm.ext1.game.Game;

/**
 * 
 * @author jlacroix
 * 
 */
abstract class AbstractDealer implements Dealer {

	/**
	 * 
	 */
	private Deck<Door> doorDeck;

	/**
	 * 
	 */
	private Game party;

	/**
	 * 
	 */
	private Deck<Treasure> treasureDeck;

	/**
	 * {@inheritDoc}
	 */
	public List<Door> dealDoors(final Integer nb2Draw) {
		return getDoorDeck().draw(nb2Draw);
	}

	/**
	 * {@inheritDoc}
	 */
	public List<Treasure> dealTreasures(final Integer nb2Draw) {
		return getTreasureDeck().draw(nb2Draw);
	}

	/**
	 * {@inheritDoc}
	 */
	public void discardDoors(final List<Door> doors) {
		getDoorDeck().discards(doors);
	}

	/**
	 * {@inheritDoc}
	 */
	public void discardTreasures(final List<Treasure> treasures) {
		getTreasureDeck().discards(treasures);
	}

	/**
	 * Getter of the property <tt>doorDeck</tt>
	 * 
	 * @return Returns the doorDeck.
	 */
	private Deck<Door> getDoorDeck() {
		return doorDeck;
	}

	/**
	 * {@inheritDoc}
	 */
	public Card getFirstTrashedCardLike(final Card card) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	public Game getParty() {
		return party;
	}

	/**
	 * Getter of the property <tt>treasureDeck</tt>
	 * 
	 * @return Returns the treasureDeck.
	 */
	private Deck<Treasure> getTreasureDeck() {
		return treasureDeck;
	}

	/**
	 * {@inheritDoc}
	 */
	public Integer sellItems(final List<Item> items) {
		int goldValue = 0;

		for (final Item item : items) {
			goldValue = goldValue + item.getGoldValue();
		}

		getTreasureDeck().discards(items);

		return goldValue / party.getMinGoldValue4OneLevelUp();
	}
}
