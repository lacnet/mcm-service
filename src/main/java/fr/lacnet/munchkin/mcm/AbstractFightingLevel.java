package fr.lacnet.munchkin.mcm;

/**
 * 
 * @author jlacroix
 * 
 */
public abstract class AbstractFightingLevel implements FightingLevel {
	/**
	 * 
	 */
	private Integer fightingLevel;

	/**
	 * {@inheritDoc}
	 */
	public int compareTo(final FightingLevel o) {
		return getValue().compareTo(o.getValue());
	}

	/**
	 * {@inheritDoc}
	 */
	public Integer getValue() {
		return fightingLevel;
	}

	/**
	 * {@inheritDoc}
	 */
	public void setValue(final Integer fightingLevel) {
		this.fightingLevel = fightingLevel;
	}
}
