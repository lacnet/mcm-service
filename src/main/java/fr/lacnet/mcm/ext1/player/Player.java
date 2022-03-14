package fr.lacnet.mcm.ext1.player;

import java.util.Collection;
import java.util.List;

import fr.lacnet.mcm.ext1.card.Card;
import fr.lacnet.mcm.ext1.card.treasure.item.Item;
import fr.lacnet.mcm.ext1.dealer.Dealer;

/**
 * 
 * @author jlacroix
 * 
 */
public interface Player {

	/**
	 * 
	 */
	void fightTheMonster();

	/**
	 * 
	 * @param nbLevelGained Integer
	 */
	void gainLevel(final Integer nbLevelGained);

	/**
	 * 
	 * @return CharacterLevel
	 */
	CharacterLevel getCharacterLevel();

	/**
	 * 
	 * @return Dealer
	 */
	Dealer getDealer();

	/**
	 * Is composed by the {@link #getCharacterLevel()} and all carried items
	 * 
	 * @return the level of the player during a fight
	 */
	FightingLevel getFightingLevel();

	/**
	 * 
	 * @return Collection<Card>
	 */
	Collection<Card> inPlay();

	/**
	 * 
	 */
	void kickingDownTheDoor();

	/**
	 * 
	 */
	void look4Trouble();

	/**
	 * Indicates if the player successfully run away or not.
	 * 
	 * @return true if the player run away. Otherwise returns false.
	 */
	Boolean runAway();

	/**
	 * 
	 * @param items
	 *            that the player want to sell
	 */
	void sellItems(List<Item> items);

	/**
	 * 
	 * @param dealer Dealer
	 */
	void setDealer(final Dealer dealer);

	/**
	 * 
	 * @param items
	 *            that the player want to trade
	 * 
	 */
	void tradeItems(List<Item> items);

	/**
	 * 
	 * @return Collection<Card>
	 */
	Collection<Card> yourHand();
}
