package fr.lacnet.munchkin.mcm.card.treasure.item;

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
