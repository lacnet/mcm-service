package fr.lacnet.munchkin.mcm.dealer.deck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import fr.lacnet.munchkin.mcm.card.Card;

/**
 * 
 * @author jlacroix
 * 
 * @param <C>
 */
public class AbstractDeck<C extends Card> implements Deck<C> {
	/**
	 * 
	 */
	private List<C> cards, discards;

	/**
	 * {@inheritDoc}
	 */
	public void discards(final List<? extends C> discards) {
		if (this.discards == null) {
			this.discards = new ArrayList<C>();
		}
		this.discards.addAll(discards);
	}

	/**
	 * {@inheritDoc}
	 */
	public final synchronized List<C> draw(final Integer nb2Draw) {
		if (isRunOver() && discards != null && discards.size() > 0) {
			shuffleDiscards();
			fillWith(drawFromDiscards(discards.size()));
		}

		final Integer nbOfCards2DrawFromDiscards = getNbOfCards2DrawFromDiscards(nb2Draw);
		final Integer nbOfCards2DrawFromCards = nb2Draw
				- nbOfCards2DrawFromDiscards;

		final List<C> result = drawPile(nbOfCards2DrawFromCards, cards);

		if (nbOfCards2DrawFromDiscards > 0) {
			result.addAll(drawFromDiscards(nbOfCards2DrawFromDiscards));
		}

		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	public final List<C> drawFromDiscards(final Integer nb2Draw) {
		return drawPile(nb2Draw, discards);
	}

	/**
	 * 
	 * @param nb2Draw
	 * @param pile
	 * @return
	 */
	private final List<C> drawPile(final Integer nb2Draw, final List<C> pile) {
		List<C> result = new ArrayList<C>(nb2Draw);

		if (nb2Draw > 0) {
			result = pile.subList(0, nb2Draw > pile.size() ? pile.size()
					: nb2Draw);
			pile.removeAll(result);
		}

		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	public void fillWith(final List<? extends C> cards) {
		if (this.cards == null) {
			this.cards = new ArrayList<C>();
		}
		this.cards.addAll(cards);
	}

	/**
	 * 
	 * @param nb2Draw
	 * @param deck
	 * @return
	 */
	private Integer getNbOfCards2DrawFromDiscards(final Integer nb2Draw) {
		return has2DrawFromDiscards(nb2Draw) ? nb2Draw - cards.size() : 0;
	}

	/**
	 * 
	 * @param nb2Draw
	 * @param deck
	 * @return
	 */
	private Boolean has2DrawFromDiscards(final Integer nb2Draw) {
		return cards != null && nb2Draw > cards.size();
	}

	/**
	 * {@inheritDoc}
	 */
	public Boolean isRunOver() {
		return cards != null && cards.isEmpty();
	}

	/**
	 * {@inheritDoc}
	 */
	public final void shuffle() {
		Collections.shuffle(cards);
	}

	/**
	 * 
	 */
	public final void shuffleDiscards() {
		Collections.shuffle(discards);
	}
}
