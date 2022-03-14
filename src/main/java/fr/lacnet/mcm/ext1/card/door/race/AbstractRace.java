package fr.lacnet.mcm.ext1.card.door.race;

import fr.lacnet.mcm.ext1.card.door.AbstractDoor;

/**
 * @author jlacroix
 */
public abstract class AbstractRace extends AbstractDoor implements Race {
	protected AbstractRace(final String name) {
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
		return false;
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
		return true;
	}
}
