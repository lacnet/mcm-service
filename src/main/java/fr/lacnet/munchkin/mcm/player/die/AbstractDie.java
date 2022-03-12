package fr.lacnet.munchkin.mcm.player.die;

import java.util.Random;

/**
 * 
 * @author jlacroix
 * 
 */
public abstract class AbstractDie implements Die {

	/**
	 * 
	 */
	private final Random generator = new Random();

	/**
	 * {@inheritDoc}
	 */
	public final Integer roll() {
		return generator.nextInt();
	}

	/**
	 * {@inheritDoc}
	 */
	public void setSidedDie(final Integer sidedDie) {
		generator.setSeed(sidedDie);
	}
}
