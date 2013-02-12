package fr.lacnet.munchkin.mcm.dealer.deck;

import java.util.List;

import fr.lacnet.munchkin.mcm.card.Card;

/**
 * 
 * @author jlacroix
 * 
 * @param <C>
 */
public interface Deck<C extends Card> {

	/**
	 * 
	 */
	void discards(final List<? extends C> discards);

	/**
	 * 
	 * @param nb2Draw
	 * @return
	 */
	List<C> draw(final Integer nb2Draw);

	/**
	 * 
	 * @param nb2Draw
	 * @return
	 */
	List<C> drawFromDiscards(final Integer nb2Draw);

	/**
	 * 
	 * @param cards
	 */
	void fillWith(List<? extends C> cards);

	/**
	 * 
	 * @return
	 */
	Boolean isRunOver();

	/**
	 * 
	 */
	void shuffle();
}
