package fr.lacnet.munchkin.mcm.player;

import fr.lacnet.munchkin.mcm.CharacterLevel;

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
