package fr.lacnet.mcm.ext1.card.treasure;

import org.junit.Assert;
import org.junit.Test;

import fr.lacnet.mcm.ext1.card.AbstractCardTest;

/**
 * @author jlacroix
 */
public abstract class AbstractTreasureTest extends AbstractCardTest {
	/**
     *
     */
	@Override
	@Test
	public final void testIsDoor() {
		Assert.assertFalse(getClassUnderTest().isDoor());
	}

	/**
     *
     */
	@Override
	@Test
	public final void testIsTreasure() {
		Assert.assertTrue(getClassUnderTest().isTreasure());
	}

	/**
     *
     */
	public abstract void testIsEquipment();

	/**
     *
     */
	public abstract void testIsPotion();
}
