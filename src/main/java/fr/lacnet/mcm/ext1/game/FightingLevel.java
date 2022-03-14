package fr.lacnet.mcm.ext1.player;

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
