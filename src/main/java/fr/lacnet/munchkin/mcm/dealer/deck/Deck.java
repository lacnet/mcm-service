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
	 * @param nb2Draw Integer
	 * @return List<C>
	 */
	List<C> draw(final Integer nb2Draw);

	/**
	 * 
	 * @param nb2Draw Integer
	 * @return List<C>
	 */
	List<C> drawFromDiscards(final Integer nb2Draw);

	/**
	 * 
	 * @param cards List<? extends C>
	 */
	void fillWith(List<? extends C> cards);

	/**
	 * 
	 * @return Boolean
	 */
	Boolean isRunOver();

	/**
	 * 
	 */
	void shuffle();
}
