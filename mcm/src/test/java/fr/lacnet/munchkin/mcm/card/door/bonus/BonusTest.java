package fr.lacnet.munchkin.mcm.card.door.bonus;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import fr.lacnet.munchkin.mcm.card.door.AbstractDoorTest;

/**
 * @author jlacroix
 */
public class BonusTest extends AbstractDoorTest {
	/**
     *
     */
	private Bonus classUnderTest;

	/**
     *
     */
	@Before
	public final void setUp() {
		classUnderTest = new BonusBean("BonusTest");

		((BonusBean) classUnderTest).setLevel(0);
		((BonusBean) classUnderTest).setPrice(0);
		((BonusBean) classUnderTest).setSize(0);
	}

	/**
	 * @return Bonus
	 */
	@Override
	protected final Bonus getClassUnderTest() {
		return classUnderTest;
	}

	/**
     *
     */
	@Override
	@Test
	public final void testIsBonus() {
		Assert.assertTrue(getClassUnderTest().isBonus());
	}

	/**
     *
     */
	@Override
	@Test
	public final void testIsClass() {
		Assert.assertFalse(getClassUnderTest().isClass());
	}

	/**
     *
     */
	@Override
	@Test
	public final void testIsCurse() {
		Assert.assertFalse(getClassUnderTest().isCurse());
	}

	/**
     *
     */
	@Override
	@Test
	public final void testIsMonster() {
		Assert.assertFalse(getClassUnderTest().isMonster());
	}

	/**
     *
     */
	@Override
	@Test
	public final void testIsRace() {
		Assert.assertFalse(getClassUnderTest().isRace());
	}

	/**
     *
     */
	@Test
	public final void testGetLevel() {
		Assert.assertEquals(0, getClassUnderTest().getLevel());
	}

	/**
     *
     */
	@Test
	public final void testGetPrice() {
		Assert.assertEquals(0, getClassUnderTest().getPrice());
	}

	/**
     *
     */
	@Test
	public final void testGetSize() {
		Assert.assertEquals(0, getClassUnderTest().getSize());
	}
}
