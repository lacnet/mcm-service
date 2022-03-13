package fr.lacnet.mcm.ext1.player;

/**
 * 
 * @author jlacroix
 * 
 */
public interface LevelTracker {

	/**
	 * 
	 * @return CharacterLevel
	 */
	CharacterLevel getCharacterLevel();

	/**
	 * 
	 * @param characterLevel CharacterLevel
	 */
	void setCharacterLevel(final CharacterLevel characterLevel);
}
