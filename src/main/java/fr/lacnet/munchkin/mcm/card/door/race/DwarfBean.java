package fr.lacnet.munchkin.mcm.card.door.race;

/**
 * @author jlacroix
 */
public class DwarfBean extends AbstractRace {
	/**
	 * @param aName
	 *            String
	 */
	public DwarfBean(final String aName) {
		// super(aName);
		// TODO Auto-generated constructor stub
	}

	/**
	 * (non-Javadoc).
	 * 
	 * @return boolean
	 * @see Race#isDwarf
	 */
	public final boolean isDwarf() {
		// TODO Auto-generated method stub
		return true;
	}

	/**
	 * (non-Javadoc).
	 * 
	 * @return boolean
	 * @see Race#isElf
	 */
	public final boolean isElf() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * (non-Javadoc).
	 * 
	 * @return boolean
	 * @see Race#isHobbit
	 */
	public final boolean isHobbit() {
		// TODO Auto-generated method stub
		return false;
	}
}
