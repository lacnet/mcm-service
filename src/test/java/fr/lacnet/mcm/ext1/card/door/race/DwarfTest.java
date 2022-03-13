package fr.lacnet.mcm.ext1.card.door.race;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author jlacroix
 */
public class DwarfTest extends AbstractRaceTest {
	/**
     *
     */
	private Race classUnderTest;

	/**
     *
     */
	@Before
	public final void setUp() {
		classUnderTest = new DwarfBean("DwarfTest");
	}

	/**
	 * @return Race
	 */
	@Override
	protected final Race getClassUnderTest() {
		return classUnderTest;
	}

	/**
     *
     */
	@Override
	@Test
	public final void testIsDwarf() {
		Assert.assertTrue(getClassUnderTest().isDwarf());
	}

	/**
     *
     */
	@Override
	@Test
	public final void testIsElf() {
		Assert.assertFalse(getClassUnderTest().isElf());
	}

	/**
     *
     */
	@Override
	@Test
	public final void testIsHobbit() {
		Assert.assertFalse(getClassUnderTest().isHobbit());
	}
}
