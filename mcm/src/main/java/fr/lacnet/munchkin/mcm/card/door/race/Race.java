package fr.lacnet.munchkin.mcm.card.door.race;

import fr.lacnet.munchkin.mcm.card.door.Door;

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
