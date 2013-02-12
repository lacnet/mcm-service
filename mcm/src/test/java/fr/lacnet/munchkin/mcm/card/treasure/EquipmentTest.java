package fr.lacnet.munchkin.mcm.card.treasure;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author jlacroix
 */
public class EquipmentTest extends AbstractTreasureTest {
	/**
     *
     */
	private Treasure classUnderTest;

	/**
     *
     */
	@Before
	public final void setUp() {
		classUnderTest = new EquipmentBean("EquipmentTest");
	}

	/**
	 * @return Treasure
	 */
	@Override
	protected final Treasure getClassUnderTest() {
		return classUnderTest;
	}

	/**
     *
     */
	@Override
	@Test
	public final void testIsEquipment() {
		Assert.assertTrue(getClassUnderTest().isEquipment());
	}

	/**
     *
     */
	@Override
	@Test
	public final void testIsPotion() {
		Assert.assertFalse(getClassUnderTest().isPotion());
	}
}
