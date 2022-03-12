package fr.lacnet.munchkin.mcm.card.door.bonus;

import fr.lacnet.munchkin.mcm.card.door.AbstractDoor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jlacroix
 */
@Getter
@Setter
public class BonusBean extends AbstractDoor implements Bonus {

	private int level;
	private int price;
	private int size;

	/**
	 * @param aName
	 *            String
	 */
	public BonusBean(final String aName) {
		super(aName);
	}

	/**
	 * (non-Javadoc).
	 */
	public final boolean isBonus() {
		return true;
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
		return false;
	}
}
