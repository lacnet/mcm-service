package fr.lacnet.mcm.ext1.card.door.curse;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import fr.lacnet.mcm.ext1.card.door.AbstractDoorTest;

/**
 * @author jlacroix
 */
public class CurseTest extends AbstractDoorTest {
	/**
    *
    */
	private Curse classUnderTest;

	/**
     *
     */
	@Before
	public final void setUp() {
		classUnderTest = new CurseBean("CurseTest");
	}

	/**
	 * @return Curse
	 */
	@Override
	protected final Curse getClassUnderTest() {
		return classUnderTest;
	}

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
		Assert.assertTrue(getClassUnderTest().isCurse());
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

	// /**
	// *
	// */
	// @Test
	// public final void testDoCurse() {
	// getClassUnderTest().doCurse();
	// }
}
