package fr.lacnet.mcm.ext1.card;

import org.jmock.Mockery;
import org.jmock.integration.junit4.JMock;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author jlacroix
 */
@RunWith(JMock.class)
public abstract class AbstractCardTest {
	/**
     *
     */
	private final Mockery context = new JUnit4Mockery();

	/**
	 * @return Mockery
	 */
	protected final Mockery getContext() {
		return context;
	}

	/**
     *
     */
	@Test
	public final void testGetName() {
		Assert.assertNotNull(getClassUnderTest().getName());
	}

	/**
	 * @return Card
	 */
	protected abstract Card getClassUnderTest();

	/**
     *
     */
	public abstract void testIsDoor();

	/**
     *
     */
	public abstract void testIsTreasure();
}
