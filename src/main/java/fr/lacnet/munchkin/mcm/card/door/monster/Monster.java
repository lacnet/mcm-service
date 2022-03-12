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
	 * @param player Player
	 */
	void executeBadStuff(Player player);

	/**
	 * 
	 * @return FightingLevel
	 */
	FightingLevel getFightingLevel();

	/**
	 * 
	 * @return Integer
	 */
	Integer getLevelGained();

	/**
	 * 
	 * @return Integer
	 */
	Integer getWonTreasureCards();

	/**
	 * 
	 * @param fightingLevel FightingLevel
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
