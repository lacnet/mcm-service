package fr.lacnet.mcm.ext1.card.door;

import fr.lacnet.mcm.ext1.card.AbstractCard;

/**
 * 
 * @author jlacroix
 * 
 */
public abstract class AbstractDoor extends AbstractCard implements Door {

	protected AbstractDoor(final String name) {
		super(name);
	}

	/**
	 * {@inheritDoc}
	 */
	public Boolean isImmediat() {
		return Boolean.FALSE;
	}

	/**
	 * (non-Javadoc).
	 */
	public final boolean isDoor() {
		return true;
	}

	/**
	 * (non-Javadoc).
	 */
	public final boolean isTreasure() {
		return false;
	}
}
