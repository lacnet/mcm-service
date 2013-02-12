package fr.lacnet.munchkin.mcm.player;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import fr.lacnet.munchkin.mcm.CharacterLevel;
import fr.lacnet.munchkin.mcm.FightingLevel;
import fr.lacnet.munchkin.mcm.card.Card;
import fr.lacnet.munchkin.mcm.card.treasure.item.Item;
import fr.lacnet.munchkin.mcm.dealer.Dealer;
import fr.lacnet.munchkin.mcm.party.Party;
import fr.lacnet.munchkin.mcm.player.die.Die;

/**
 * 
 * @author jlacroix
 * 
 */
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

	/***
	 * *
	 */
	private LevelTracker levelTracker;

	/**
	 * 
	 */
	private Party party;

	/**
	 * 
	 */
	private Die sixSidedDie;

	/**
	 * 
	 */
	private final Collection<Card> yourHand = new ArrayList<Card>(
			AbstractPlayer.HAND_SIZE);

	/**
	 * {@inheritDoc}
	 */
	public void fightTheMonster() {
		// TODO Auto-generated method stub
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
	public CharacterLevel getCharacterLevel() {
		return getLevelTracker().getCharacterLevel();
	}

	/**
	 * {@inheritDoc} Getter of the property <tt>dealer</tt>
	 * 
	 * @return Returns the dealer.
	 */
	public Dealer getDealer() {
		return dealer;
	}

	/**
	 * {@inheritDoc} Getter of the property <tt>fightingLevel</tt>
	 * 
	 * @return Returns the fightingLevel.
	 */
	public FightingLevel getFightingLevel() {
		return fightingLevel;
	}

	/**
	 * Getter of the property <tt>levelTracker</tt>
	 * 
	 * @return Returns the levelTracker.
	 */
	private LevelTracker getLevelTracker() {
		return levelTracker;
	}

	/**
	 * Getter of the property <tt>sixSidedDie</tt>
	 * 
	 * @return Returns the sixSidedDie.
	 */
	private Die getSixSidedDie() {
		return sixSidedDie;
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
	}

	/**
	 * {@inheritDoc}
	 */
	public void look4Trouble() {
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
	 * {@inheritDoc} Setter of the property <tt>dealer</tt>
	 * 
	 * @param dealer
	 *            The dealer to set.
	 */
	public void setDealer(final Dealer dealer) {
		this.dealer = dealer;
	}

	/**
	 * {@inheritDoc}
	 */
	public void tradeItems(final List<Item> items) {
	}

	/**
	 * {@inheritDoc}
	 */
	public Collection<Card> yourHand() {
		return yourHand;
	}
}
