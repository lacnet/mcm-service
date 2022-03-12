package fr.lacnet.munchkin.mcm.dealer;

import java.util.List;

import fr.lacnet.munchkin.mcm.card.Card;
import fr.lacnet.munchkin.mcm.card.door.Door;
import fr.lacnet.munchkin.mcm.card.treasure.Treasure;
import fr.lacnet.munchkin.mcm.card.treasure.item.Item;
import fr.lacnet.munchkin.mcm.dealer.deck.Deck;
import fr.lacnet.munchkin.mcm.party.Party;

/**
 * 
 * @author jlacroix
 * 
 */
public abstract class AbstractDealer implements Dealer {

	/**
	 * 
	 */
	private Deck<Door> doorDeck;

	/**
	 * 
	 */
	private Party party;

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
	public Party getParty() {
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
