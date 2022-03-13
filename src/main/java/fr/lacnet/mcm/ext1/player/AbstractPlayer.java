package fr.lacnet.mcm.ext1.player;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import fr.lacnet.mcm.ext1.card.Card;
import fr.lacnet.mcm.ext1.card.treasure.item.Item;
import fr.lacnet.mcm.ext1.dealer.Dealer;
import fr.lacnet.mcm.ext1.game.Game;
import fr.lacnet.mcm.ext1.player.die.Die;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author jlacroix
 * 
 */
@Getter
@Setter
public abstract class AbstractPlayer implements Player {
	/**
	 * 
	 */
	public static final Integer HAND_SIZE = 5;

	/**
	 * 
	 */
	private Dealer dealer;

	/**
	 * 
	 */
	private FightingLevel fightingLevel;

	/**
	 * 
	 */
	private Collection<Card> inPlay;

	/**
	 *
	 */
	private LevelTracker levelTracker;

	/**
	 * 
	 */
	private Game party;

	/**
	 * 
	 */
	private Die sixSidedDie;

	/**
	 * 
	 */
	private final Collection<Card> yourHand = new ArrayList<>(
			AbstractPlayer.HAND_SIZE);

	/**
	 * {@inheritDoc}
	 */
	public void fightTheMonster() {
		System.out.println("fightTheMonster");
	}

	/**
	 * {@inheritDoc}
	 */
	public void gainLevel(final Integer nbLevelGained) {
		getCharacterLevel().setValue(
				getCharacterLevel().getValue() + nbLevelGained);
	}

	/**
	 * {@inheritDoc}
	 */
	public Collection<Card> inPlay() {
		return inPlay;
	}

	/**
	 * {@inheritDoc}
	 */
	public void kickingDownTheDoor() {
		System.out.println("fightTheMonster");
	}

	/**
	 * {@inheritDoc}
	 */
	public void look4Trouble() {
		System.out.println("look4Trouble");
	}

	/**
	 * 
	 * @return the value returns by the sixSidedDie
	 */
	private Integer rollDie() {
		return getSixSidedDie().roll();
	}

	/**
	 * {@inheritDoc}
	 */
	public Boolean runAway() {
		return rollDie() > party.getMinValue4SuccededRunaway();
	}

	/**
	 * {@inheritDoc}
	 */
	public void sellItems(final List<Item> items) {
		gainLevel(dealer.sellItems(items));
	}

	/**
	 * {@inheritDoc}
	 */
	public void tradeItems(final List<Item> items) {
		System.out.println("look4Trouble");
	}

	/**
	 * {@inheritDoc}
	 */
	public Collection<Card> yourHand() {
		return yourHand;
	}
}
