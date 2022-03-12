package fr.lacnet.munchkin.mcm.card.door.monster;

import fr.lacnet.munchkin.mcm.FightingLevel;
import fr.lacnet.munchkin.mcm.card.door.AbstractDoor;
import fr.lacnet.munchkin.mcm.card.door.monster.type.Type;
import fr.lacnet.munchkin.mcm.player.Player;

/**
 * @author jlacroix
 */
public class MonsterBean extends AbstractDoor implements Monster {
	/**
     *
     */
	private int effectiveLevel = 0;
	private int treasureNumber = 0;

	/**
     *
     */
	private Type type;

	/**
	 * @param aName
	 *            String
	 */
	public MonsterBean(final String aName) {
		super(aName);
	}

	/**
	 * (non-Javadoc).
	 */
	public final boolean isBonus() {
		return false;
	}

	/**
	 * (non-Javadoc).
	 */
	public final boolean isClass() {
		return false;
	}

	/**
	 * (non-Javadoc).
	 */
	public final boolean isCurse() {
		return false;
	}

	/**
	 * (non-Javadoc).
	 */
	public final boolean isMonster() {
		return true;
	}

	/**
	 * (non-Javadoc).
	 */
	public final boolean isRace() {
		return false;
	}

	/**
	 * (non-Javadoc).
	 */
	public final int getEffectiveLevel() {
		return effectiveLevel;
	}

	/**
	 * @param anEffectiveLevel
	 *            int
	 */
	public final void setEffectiveLevel(final int anEffectiveLevel) {
		effectiveLevel = anEffectiveLevel;
	}

	/**
	 * (non-Javadoc).
	 */
	public final int getTreasureNumber() {
		return treasureNumber;
	}

	/**
	 * @param aTtreasureNumber
	 *            int
	 */
	public final void setTreasureNumber(final int aTtreasureNumber) {
		treasureNumber = aTtreasureNumber;
	}

	/**
	 * (non-Javadoc).
	 */
	public final Type getType() {
		return type;
	}

	/**
	 * @param aType
	 *            Type
	 */
	public final void setType(final Type aType) {
		type = aType;
	}

	/**
	 * (non-Javadoc).
	 */
	public void executeBadStuff(final Player player) {
		// TODO Auto-generated method stub

	}

	/**
	 * (non-Javadoc).
	 */
	public FightingLevel getFightingLevel() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * (non-Javadoc).
	 */
	public Integer getLevelGained() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * (non-Javadoc).
	 */
	public Integer getWonTreasureCards() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * (non-Javadoc).
	 */
	public void setFightingLevel(final FightingLevel fightingLevel) {
		// TODO Auto-generated method stub

	}
}
