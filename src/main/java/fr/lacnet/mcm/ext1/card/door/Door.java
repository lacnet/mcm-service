package fr.lacnet.mcm.ext1.card.door;

import fr.lacnet.mcm.ext1.card.Card;

/**
 * 
 * @author jlacroix
 * 
 */
public interface Door extends Card {

	/**
	 * 
	 * @return Boolean
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
