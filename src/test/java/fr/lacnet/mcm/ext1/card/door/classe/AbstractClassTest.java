package fr.lacnet.mcm.ext1.card.door.classe;

import org.junit.Assert;
import org.junit.Test;

import fr.lacnet.mcm.ext1.card.door.AbstractDoorTest;

/**
 * @author jlacroix
 */
public abstract class AbstractClassTest extends AbstractDoorTest {
	/**
     *
     */
	@Override
	@Test
	public final void testIsBonus() {
		Assert.assertFalse(getClassUnderTest().isBonus());
	}

	/**
     *
     */
	@Override
	@Test
	public final void testIsClass() {
		Assert.assertTrue(getClassUnderTest().isClass());
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
	public abstract void testIsPriest();

	/**
     *
     */
	public abstract void testIsRobber();

	/**
     *
     */
	public abstract void testIsWarrior();
}
