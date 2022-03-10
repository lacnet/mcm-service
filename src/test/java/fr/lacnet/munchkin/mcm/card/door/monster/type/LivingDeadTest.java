package fr.lacnet.munchkin.mcm.card.door.monster.type;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author jlacroix
 * @RunWith(JMock.class)
 */
public class LivingDeadTest {
	/**
     *
     */
	private Type classUnderTest;

	/**
     *
     */
	@Before
	public final void setUp() {
		classUnderTest = new LivingDead();
	}

	/**
     *
     */
	@Test
	public final void testIsLivingDead() {
		Assert.assertTrue(classUnderTest.isLivingDead());
	}
}
