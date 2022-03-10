package fr.lacnet.munchkin.mcm.card.door.monster;

import fr.lacnet.munchkin.mcm.FightingLevel;
import fr.lacnet.munchkin.mcm.card.door.AbstractDoor;
import fr.lacnet.munchkin.mcm.player.Player;

/**
 * 
 * @author jlacroix
 * 
 */
public abstract class AbstractMonster extends AbstractDoor implements Monster {
	/**
	 * 
	 */
	private BadStuff badStuff;

	/**
	 * 
	 */
	private FightingLevel fightingLevel;

	/**
	 * 
	 */
	private Integer levelGained, treasureCards;

	/**
	 * {@inheritDoc}
	 */
	public void executeBadStuff(final Player player) {
		badStuff.happens();
	}

	/**
	 * {@inheritDoc}
	 */
	public FightingLevel getFightingLevel() {
		return fightingLevel;
	}

	/**
	 * {@inheritDoc}
	 */
	public Integer getLevelGained() {
		return levelGained;
	}

	/**
	 * {@inheritDoc}
	 */
	public Integer getWonTreasureCards() {
		return treasureCards;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean isImmediat() {
		return Boolean.TRUE;
	}

	/**
	 * {@inheritDoc}
	 */
	public void setFightingLevel(final FightingLevel fightingLevel) {
		this.fightingLevel = fightingLevel;
	}
}
