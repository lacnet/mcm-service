package fr.lacnet.munchkin.mcm.card;

/**
 * 
 * @author jlacroix
 * 
 */
public abstract class AbstractCard implements Card {
	String name;

	/**
	 * {@inheritDoc}
	 */
	public String getName() {
		return name;
	}
}
