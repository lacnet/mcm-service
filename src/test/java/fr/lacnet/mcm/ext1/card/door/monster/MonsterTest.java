package fr.lacnet.mcm.ext1.card.door.monster;

import fr.lacnet.mcm.ext1.card.door.monster.type.Type;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import fr.lacnet.mcm.ext1.card.door.AbstractDoorTest;

/**
 * @author jlacroix
 */
public class MonsterTest extends AbstractDoorTest {
	/**
     *
     */
	private Monster classUnderTest;

	/**
     *
     */
	@Before
	public final void setUp() {
		classUnderTest = new MonsterBean("MonsterTest");
		((MonsterBean) classUnderTest).setEffectiveLevel(0);
		((MonsterBean) classUnderTest).setTreasureNumber(0);

		((MonsterBean) classUnderTest).setType(getContext().mock(Type.class));
	}

	/**
	 * @return Monster
	 */
	@Override
	protected final Monster getClassUnderTest() {
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
		Assert.assertFalse(getClassUnderTest().isCurse());
	}

	/**
     *
     */
	@Override
	@Test
	public final void testIsMonster() {
		Assert.assertTrue(getClassUnderTest().isMonster());
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
	@Test
	public final void testGetType() {
		Assert.assertNotNull(getClassUnderTest().getType());
	}

	/**
     *
     */
	@Test
	public final void testGetEffectiveLevel() {
		Assert.assertEquals(0, getClassUnderTest().getEffectiveLevel());
	}

	/**
     *
     */
	@Test
	public final void testGetTreasureNumber() {
		Assert.assertEquals(0, getClassUnderTest().getTreasureNumber());
	}
}
