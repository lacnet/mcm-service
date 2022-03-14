package fr.lacnet.mcm.ext1.player;

/**
 * 
 * @author jlacroix
 * 
 */
public interface CharacterLevel extends Comparable<CharacterLevel> {

	/**
	 * 
	 * @return Integer
	 */
	Integer getValue();

	/**
	 * 
	 * @param characterLevel Integer
	 */
	void setValue(Integer characterLevel);
}
