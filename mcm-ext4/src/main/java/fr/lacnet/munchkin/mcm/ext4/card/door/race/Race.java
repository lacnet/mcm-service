package fr.lacnet.munchkin.mcm.ext4.card.door.race;

import fr.lacnet.munchkin.mcm.card.door.monster.Monster;

/**
 * 
 * @author jla
 *
 */
public interface Race extends fr.lacnet.munchkin.mcm.card.door.race.Race{
	/**
	 * 
	 * @return
	 */
	public boolean isGnoneFor(Monster aMonster);
}
