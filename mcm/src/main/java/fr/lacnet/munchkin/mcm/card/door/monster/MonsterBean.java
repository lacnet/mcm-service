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
	private int effectiveLevel, treasureNumber = 0;

	/**
     *
     */
	private Type type = null;

	/**
	 * @param aName
	 *            String
	 */
	public MonsterBean(final String aName) {
		// super(aName);
	}

	/**
	 * (non-Javadoc).
	 * 
	 * @return boolean
	 * @see fr.lacnet.munchkin.mdm.card.donjon.Donjon#isBonus()
	 */
	public final boolean isBonus() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * (non-Javadoc).
	 * 
	 * @return boolean
	 * @see fr.lacnet.munchkin.mdm.card.donjon.Donjon#isClass()
	 */
	public final boolean isClass() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * (non-Javadoc).
	 * 
	 * @return boolean
	 * @see fr.lacnet.munchkin.mdm.card.donjon.Donjon#isCurse()
	 */
	public final boolean isCurse() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * (non-Javadoc).
	 * 
	 * @return boolean
	 * @see fr.lacnet.munchkin.mdm.card.donjon.Donjon#isMonster()
	 */
	public final boolean isMonster() {
		// TODO Auto-generated method stub
		return true;
	}

	/**
	 * (non-Javadoc).
	 * 
	 * @return boolean
	 * @see fr.lacnet.munchkin.mdm.card.donjon.Donjon#isRace()
	 */
	public final boolean isRace() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * (non-Javadoc).
	 * 
	 * @return int
	 * @see Monster#getEffectiveLevel()
	 */
	public final int getEffectiveLevel() {
		// TODO Auto-generated method stub
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
	 * 
	 * @return int
	 * @see Monster#getTreasureNumber()
	 */
	public final int getTreasureNumber() {
		// TODO Auto-generated method stub
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
	 * 
	 * @return Type
	 * @see Monster#getType()
	 */
	public final Type getType() {
		// TODO Auto-generated method stub
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
	 * 
	 * @see
	 */
	public void executeBadStuff(final Player player) {
		// TODO Auto-generated method stub

	}

	/**
	 * (non-Javadoc).
	 * 
	 * @see
	 */
	public FightingLevel getFightingLevel() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * (non-Javadoc).
	 * 
	 * @see
	 */
	public Integer getLevelGained() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * (non-Javadoc).
	 * 
	 * @see
	 */
	public Integer getWonTreasureCards() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * (non-Javadoc).
	 * 
	 * @see
	 */
	public void setFightingLevel(final FightingLevel fightingLevel) {
		// TODO Auto-generated method stub

	}
}
