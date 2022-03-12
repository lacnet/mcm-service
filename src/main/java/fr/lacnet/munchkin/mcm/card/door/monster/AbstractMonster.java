package fr.lacnet.munchkin.mcm.card.door.monster;

import fr.lacnet.munchkin.mcm.FightingLevel;
import fr.lacnet.munchkin.mcm.card.door.AbstractDoor;
import fr.lacnet.munchkin.mcm.player.Player;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author jlacroix
 * 
 */
@Getter
@Setter
public abstract class AbstractMonster extends AbstractDoor implements Monster {

	private BadStuff badStuff;

	private FightingLevel fightingLevel;

	private Integer levelGained;
	private Integer treasureCards;


	protected AbstractMonster(final String name) {
		super(name);
	}

	/**
	 * {@inheritDoc}
	 */
	public void executeBadStuff(final Player player) {
		badStuff.happens();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean isImmediat() {
		return Boolean.TRUE;
	}
}
