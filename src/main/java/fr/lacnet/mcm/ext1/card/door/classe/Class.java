package fr.lacnet.mcm.ext1.card.door.classe;

import fr.lacnet.mcm.ext1.card.door.Door;

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
