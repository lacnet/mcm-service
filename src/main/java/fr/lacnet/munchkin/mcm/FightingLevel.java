package fr.lacnet.munchkin.mcm;

/**
 * 
 * @author jlacroix
 * 
 */
public interface FightingLevel extends Comparable<FightingLevel> {

	/**
	 * 
	 * @return Integer
	 */
	Integer getValue();

	/**
	 * 
	 * @param fightingLevel Integer
	 */
	void setValue(Integer fightingLevel);
}
