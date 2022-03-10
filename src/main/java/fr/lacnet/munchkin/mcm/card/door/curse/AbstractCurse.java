package fr.lacnet.munchkin.mcm.card.door.curse;

import fr.lacnet.munchkin.mcm.card.door.AbstractDoor;

/**
 * 
 * @author jlacroix
 * 
 */
public abstract class AbstractCurse extends AbstractDoor implements Curse {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean isImmediat() {
		return Boolean.TRUE;
	}
}
