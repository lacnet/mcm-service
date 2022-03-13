package fr.lacnet.mcm.ext1.card.door.classe;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author jlacroix
 */
public class RobberTest extends AbstractClassTest {
	/**
     *
     */
	private Class classUnderTest;

	/**
     *
     */
	@Before
	public final void setUp() {
		classUnderTest = new RobberBean("RobberTest");
	}

	/**
	 * @return Class
	 */
	@Override
	protected final Class getClassUnderTest() {
		return classUnderTest;
	}

	/**
     *
     */
	@Override
	@Test
	public final void testIsPriest() {
		Assert.assertFalse(getClassUnderTest().isPriest());
	}

	/**
     *
     */
	@Override
	@Test
	public final void testIsRobber() {
		Assert.assertTrue(getClassUnderTest().isRobber());
	}

	/**
     *
     */
	@Override
	@Test
	public final void testIsWarrior() {
		Assert.assertFalse(getClassUnderTest().isWarrior());
	}
}
