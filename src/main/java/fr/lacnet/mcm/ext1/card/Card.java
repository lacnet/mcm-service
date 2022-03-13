package fr.lacnet.mcm.ext1.card;

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
