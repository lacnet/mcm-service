package fr.lacnet.mcm.ext1.card.door.bonus;

import fr.lacnet.mcm.ext1.card.door.Door;

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
