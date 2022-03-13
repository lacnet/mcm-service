package fr.lacnet.mcm.ext1.player;

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
