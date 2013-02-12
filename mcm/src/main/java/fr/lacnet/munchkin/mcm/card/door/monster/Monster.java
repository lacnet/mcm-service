package fr.lacnet.munchkin.mcm.card.door.monster;

import fr.lacnet.munchkin.mcm.FightingLevel;
import fr.lacnet.munchkin.mcm.card.door.Door;
import fr.lacnet.munchkin.mcm.card.door.monster.type.Type;
import fr.lacnet.munchkin.mcm.player.Player;

/**
 * 
 * @author jlacroix
 * 
 */
public interface Monster extends Door {

	/**
	 * 
	 * @param player
	 */
	void executeBadStuff(Player player);

	/**
	 * 
	 * @return
	 */
	FightingLevel getFightingLevel();

	/**
	 * 
	 * @return
	 */
	Integer getLevelGained();

	/**
	 * 
	 * @return
	 */
	Integer getWonTreasureCards();

	/**
	 * 
	 * @param fightingLevel
	 */
	void setFightingLevel(final FightingLevel fightingLevel);

	/**
	 * @return int
	 */
	int getEffectiveLevel();

	/**
	 * @return int
	 */
	int getTreasureNumber();

	/**
	 * @return Type
	 */
	Type getType();
}
