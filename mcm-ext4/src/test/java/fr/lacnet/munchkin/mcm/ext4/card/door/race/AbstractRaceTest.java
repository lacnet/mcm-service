package fr.lacnet.munchkin.mcm.ext4.card.door.race;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.jmock.Mockery;
import org.jmock.integration.junit4.JMock;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.Test;
import org.junit.runner.RunWith;

import fr.lacnet.munchkin.mcm.ext4.card.door.race.Race;

/**
 * 
 * @author jla
 *
 */
@RunWith(JMock.class)
public abstract class AbstractRaceTest{
	/**
	 * 
	 */
	protected Mockery context = new JUnit4Mockery();

	/**
	 * 
	 */
	protected Race classUnderTest;
	
	/**
	 * 
	 */
	@Test
	public void testIsDonjon() {
		assertTrue(classUnderTest.isDoor());
	}

	/**
	 * 
	 */
	@Test
	public void testIsTreasure() {
		assertFalse(classUnderTest.isTreasure());
	}

	/**
	 * 
	 */
	@Test
	public void testIsBonus() {
		assertFalse(classUnderTest.isBonus());
	}

	/**
	 * 
	 */
	public void testIsClass() {
		assertFalse(classUnderTest.isClass());
	}

	/**
	 * 
	 */
	@Test
	public void testIsMalediction() {
		assertFalse(classUnderTest.isCurse());
	}

	/**
	 * 
	 */
	@Test
	public void testIsMonster() {
		assertFalse(classUnderTest.isMonster());
	}

	/**
	 * 
	 */
	@Test
	public void testIsRace() {
		assertTrue(classUnderTest.isRace());
	}

	/**
	 * 
	 */
	@Test
	public void testIsGnoneFor() {
		assertTrue( classUnderTest.isGnoneFor(null) );
	}
}
