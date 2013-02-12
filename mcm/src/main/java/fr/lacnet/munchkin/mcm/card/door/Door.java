package fr.lacnet.munchkin.mcm.card.door;

import fr.lacnet.munchkin.mcm.card.Card;

/**
 * 
 * @author jlacroix
 * 
 */
public interface Door extends Card {

	/**
	 * 
	 * @return
	 */
	Boolean isImmediat();

	/**
	 * @return boolean
	 */
	boolean isMonster();

	/**
	 * @return boolean
	 */
	boolean isCurse();

	/**
	 * @return boolean
	 */
	boolean isBonus();

	/**
	 * @return boolean
	 */
	boolean isClass();

	/**
	 * @return boolean
	 */
	boolean isRace();
}
