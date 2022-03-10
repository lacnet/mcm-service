package fr.lacnet.munchkin.mcm.card.treasure;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author jlacroix
 */
public class PotionTest extends AbstractTreasureTest {
	/**
     *
     */
	private Treasure classUnderTest;

	/**
     *
     */
	@Before
	public final void setUp() {
		classUnderTest = new PotionBean("PotionTest");
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
		Assert.assertFalse(getClassUnderTest().isEquipment());
	}

	/**
     *
     */
	@Override
	@Test
	public final void testIsPotion() {
		Assert.assertTrue(getClassUnderTest().isPotion());
	}
}
