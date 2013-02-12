package fr.lacnet.munchkin.mcm.card.door.classe;

import fr.lacnet.munchkin.mcm.card.door.Door;

/**
 * @author jlacroix
 */
public interface Class extends Door {
	/**
	 * @return boolean
	 */
	boolean isRobber();

	/**
	 * @return boolean
	 */
	boolean isWarrior();

	/**
	 * @return boolean
	 */
	boolean isPriest();
}
