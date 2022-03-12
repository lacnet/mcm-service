package fr.lacnet.munchkin.mcm.card.treasure;

import fr.lacnet.munchkin.mcm.card.AbstractCard;

/**
 * @author jlacroix
 */
public abstract class AbstractTreasure extends AbstractCard implements Treasure {
	protected AbstractTreasure(final String name) {
		super(name);
	}

	/**
	 * (non-Javadoc).
	 */
	public final boolean isDoor() {
		return false;
	}

	/**
	 * (non-Javadoc).
	 */
	public final boolean isTreasure() {
		return true;
	}
}
