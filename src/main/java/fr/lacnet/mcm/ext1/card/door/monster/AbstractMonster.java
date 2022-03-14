package fr.lacnet.mcm.ext1.card.door.monster;

import fr.lacnet.mcm.ext1.player.FightingLevel;
import fr.lacnet.mcm.ext1.card.door.AbstractDoor;
import fr.lacnet.mcm.ext1.player.Player;
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
