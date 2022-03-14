package fr.lacnet.mcm.ext1.card.door.monster.type;

import org.jmock.integration.junit4.JMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author jlacroix
 */
@RunWith(JMock.class)
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
