package fr.lacnet.munchkin.mcm.player;

import fr.lacnet.munchkin.mcm.CharacterLevel;

/**
 * 
 * @author jlacroix
 * 
 */
public abstract class AbstractLevelTracker implements LevelTracker {
	/**
	 * 
	 */
	private CharacterLevel characterLevel;

	/**
	 * {@inheritDoc}
	 */
	public CharacterLevel getCharacterLevel() {
		return characterLevel;
	}

	/**
	 * {@inheritDoc}
	 */
	public void setCharacterLevel(final CharacterLevel characterLevel) {
		this.characterLevel = characterLevel;
	}
}
