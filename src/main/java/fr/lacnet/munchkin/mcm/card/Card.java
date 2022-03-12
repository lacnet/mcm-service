package fr.lacnet.munchkin.mcm.card;

/**
 * 
 * @author jlacroix
 * 
 */
public interface Card {
	String getName();

	/**
	 * @return boolean
	 */
	boolean isTreasure();

	/**
	 * @return boolean
	 */
	boolean isDoor();
}
