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
	 * @return
	 */
	CharacterLevel getCharacterLevel();

	/**
	 * 
	 * @param characterLevel
	 */
	void setCharacterLevel(final CharacterLevel characterLevel);
}
