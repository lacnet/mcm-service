package fr.lacnet.munchkin.mcm.card.door.bonus;

import fr.lacnet.munchkin.mcm.card.door.Door;

/**
 * @author jlacroix
 */
public interface Bonus extends Door {
	/**
	 * @return int
	 */
	int getPrice();

	/**
	 * @return int
	 */
	int getSize();

	/**
	 * @return int
	 */
	int getLevel();
}
