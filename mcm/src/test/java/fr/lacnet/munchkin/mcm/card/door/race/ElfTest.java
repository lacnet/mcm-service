package fr.lacnet.munchkin.mcm.card.door.race;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author jlacroix
 */
public class ElfTest extends AbstractRaceTest {
	/**
     *
     */
	private Race classUnderTest;

	/**
     *
     */
	@Before
	public final void setUp() {
		classUnderTest = new ElfBean("ElfTest");
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
		Assert.assertFalse(getClassUnderTest().isDwarf());
	}

	/**
     *
     */
	@Override
	@Test
	public final void testIsElf() {
		Assert.assertTrue(getClassUnderTest().isElf());
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
