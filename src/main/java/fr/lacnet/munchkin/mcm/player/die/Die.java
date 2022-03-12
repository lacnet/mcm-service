package fr.lacnet.munchkin.mcm.player.die;

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
