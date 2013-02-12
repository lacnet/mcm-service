package fr.lacnet.munchkin.mcm.card.door.race;

import org.junit.Assert;
import org.junit.Test;

import fr.lacnet.munchkin.mcm.card.door.AbstractDoorTest;

/**
 * @author jlacroix
 */
public abstract class AbstractRaceTest extends AbstractDoorTest {

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
		Assert.assertTrue(getClassUnderTest().isRace());
	}

	/**
     *
     */
	public abstract void testIsDwarf();

	/**
     *
     */
	public abstract void testIsElf();

	/**
     *
     */
	public abstract void testIsHobbit();
}
