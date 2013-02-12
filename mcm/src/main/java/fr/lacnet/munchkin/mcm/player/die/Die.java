package fr.lacnet.munchkin.mcm.player.die;

/**
 * 
 * @author jlacroix
 * 
 */
public interface Die {
	/**
	 * 
	 * @return
	 */
	Integer roll();

	/**
	 * 
	 * @param sidedDie
	 */
	void setSidedDie(final Integer sidedDie);
}
