package fr.lacnet.mcm.ext1.card.treasure.item;

/**
 * 
 * @author jlacroix
 * 
 */
public abstract class AbstractItem implements Item {

	/**
	 * 
	 */
	private Integer goldValue;

	/**
	 * {@inheritDoc}
	 */
	public Integer getGoldValue() {
		return goldValue;
	}
}
