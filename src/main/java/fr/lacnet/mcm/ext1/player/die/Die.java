package fr.lacnet.mcm.ext1.player.die;

/**
 * 
 * @author jlacroix
 * 
 */
public interface Die {
	/**
	 * 
	 * @return Integer
	 */
	Integer roll();

	/**
	 * 
	 * @param sidedDie Integer
	 */
	void setSidedDie(final Integer sidedDie);
}
