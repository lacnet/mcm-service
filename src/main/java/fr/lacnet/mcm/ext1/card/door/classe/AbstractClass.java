package fr.lacnet.mcm.ext1.card.door.classe;

import fr.lacnet.mcm.ext1.card.door.AbstractDoor;

/**
 * @author jlacroix
 */
public abstract class AbstractClass extends AbstractDoor implements Class {

	protected AbstractClass(final String name) {
		super(name);
	}

	/**
	 * (non-Javadoc).
	 */
	public final boolean isBonus() {
		return false;
	}

	/**
	 * (non-Javadoc).
	 */
	public final boolean isClass() {
		return true;
	}

	/**
	 * (non-Javadoc).
	 */
	public final boolean isCurse() {
		return false;
	}

	/**
	 * (non-Javadoc).
	 */
	public final boolean isMonster() {
		return false;
	}

	/**
	 * (non-Javadoc).
	 */
	public final boolean isRace() {
		return false;
	}
}
