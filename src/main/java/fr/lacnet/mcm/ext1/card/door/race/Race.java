package fr.lacnet.mcm.ext1.card.door.race;

import fr.lacnet.mcm.ext1.card.door.Door;

/**
 * 
 * @author jlacroix
 * 
 */
public interface Race extends Door {
	/**
	 * @return boolean
	 */
	boolean isDwarf();

	/**
	 * @return boolean
	 */
	boolean isElf();

	/**
	 * @return boolean
	 */
	boolean isHobbit();
}
