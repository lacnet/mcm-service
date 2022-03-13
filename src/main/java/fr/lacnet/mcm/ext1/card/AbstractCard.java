package fr.lacnet.mcm.ext1.card;

import lombok.Getter;

/**
 * 
 * @author jlacroix
 * 
 */
@Getter
public abstract class AbstractCard implements Card {
	private final String name;

	protected AbstractCard(final String name) {
		this.name = name;
	}
}
