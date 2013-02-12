package fr.lacnet.munchkin.mcm;

/**
 * 
 * @author jlacroix
 * 
 */
public interface FightingLevel extends Comparable<FightingLevel> {

	/**
	 * 
	 * @return
	 */
	public Integer getValue();

	/**
	 * 
	 * @param fightingLevel
	 */
	public void setValue(Integer fightingLevel);
}
