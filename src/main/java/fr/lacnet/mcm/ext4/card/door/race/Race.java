package fr.lacnet.mcm.ext4.card.door.race;

import fr.lacnet.mcm.ext1.card.door.monster.Monster;

/**
 * 
 * @author jla
 *
 */
public interface Race extends fr.lacnet.mcm.ext1.card.door.race.Race {
	/**
	 * 
	 * @return boolean
	 */
	boolean isGnoneFor(Monster aMonster);
}
