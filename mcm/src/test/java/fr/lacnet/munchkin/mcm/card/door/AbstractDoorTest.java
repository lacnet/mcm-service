package fr.lacnet.munchkin.mcm.card.door;

import org.junit.Assert;
import org.junit.Test;

import fr.lacnet.munchkin.mcm.card.AbstractCardTest;

/**
 * @author jlacroix
 */
public abstract class AbstractDoorTest extends AbstractCardTest {
	/**
	 * @return Door
	 */
	@Override
	protected abstract Door getClassUnderTest();

	/**
     *
     */
	@Override
	@Test
	public final void testIsDoor() {
		Assert.assertTrue(getClassUnderTest().isDoor());
	}

	/**
     *
     */
	@Override
	@Test
	public final void testIsTreasure() {
		Assert.assertFalse(getClassUnderTest().isTreasure());
	}

	/**
     *
     */
	public abstract void testIsBonus();

	/**
     *
     */
	public abstract void testIsClass();

	/**
     *
     */
	public abstract void testIsCurse();

	/**
     *
     */
	public abstract void testIsMonster();

	/**
     *
     */
	public abstract void testIsRace();
}
