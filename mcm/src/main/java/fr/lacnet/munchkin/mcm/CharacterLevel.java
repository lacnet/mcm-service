package fr.lacnet.munchkin.mcm;

/**
 * 
 * @author jlacroix
 * 
 */
public interface CharacterLevel extends Comparable<CharacterLevel> {

	/**
	 * 
	 * @return
	 */
	public Integer getValue();

	/**
	 * 
	 * @param characterLevel
	 */
	public void setValue(Integer characterLevel);
}
