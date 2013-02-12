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
		// super(aName);
		// TODO Auto-generated constructor stub
	}

	/**
	 * (non-Javadoc).
	 * 
	 * @return boolean
	 * @see fr.lacnet.munchkin.mdm.card.donjon.Donjon#isBonus()
	 */
	public final boolean isBonus() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * (non-Javadoc).
	 * 
	 * @return boolean
	 * @see fr.lacnet.munchkin.mdm.card.donjon.Donjon#isClass()
	 */
	public final boolean isClass() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * (non-Javadoc).
	 * 
	 * @return boolean
	 * @see fr.lacnet.munchkin.mdm.card.donjon.Donjon#isCurse()
	 */
	public final boolean isCurse() {
		// TODO Auto-generated method stub
		return true;
	}

	/**
	 * (non-Javadoc).
	 * 
	 * @return boolean
	 * @see fr.lacnet.munchkin.mdm.card.donjon.Donjon#isMonster()
	 */
	public final boolean isMonster() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * (non-Javadoc).
	 * 
	 * @return boolean
	 * @see fr.lacnet.munchkin.mdm.card.donjon.Donjon#isRace()
	 */
	public final boolean isRace() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * (non-Javadoc).
	 * 
	 * @see Curse#doCurse()
	 */
	public final void doCurse() {
		// TODO Auto-generated method stub
		System.out.println(getName());
	}

	/**
	 * (non-Javadoc).
	 * 
	 * @see Curse#apply(Player)
	 */
	public void apply(final Player player) {
		// TODO Auto-generated method stub
		System.out.println(getName());
	}
}
