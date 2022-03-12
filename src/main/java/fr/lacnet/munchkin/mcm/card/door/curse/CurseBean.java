package fr.lacnet.munchkin.mcm.card.door.curse;

import fr.lacnet.munchkin.mcm.card.door.AbstractDoor;
import fr.lacnet.munchkin.mcm.player.Player;

/**
 * @author jlacroix
 */
public class CurseBean extends AbstractDoor implements Curse {
	/**
	 * @param aName
	 *            String
	 */
	public CurseBean(final String aName) {
		super(aName);
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
		return true;
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

	/**
	 * (non-Javadoc).
	 */
	public final void doCurse() {
		// TODO Auto-generated method stub
		System.out.println(getName());
	}

	/**
	 * (non-Javadoc).
	 */
	public void apply(final Player player) {
		// TODO Auto-generated method stub
		System.out.println(getName());
	}
}
