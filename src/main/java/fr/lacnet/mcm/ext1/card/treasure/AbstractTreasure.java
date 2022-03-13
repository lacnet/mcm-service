package fr.lacnet.mcm.ext1.card.treasure;

import fr.lacnet.mcm.ext1.card.AbstractCard;

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
