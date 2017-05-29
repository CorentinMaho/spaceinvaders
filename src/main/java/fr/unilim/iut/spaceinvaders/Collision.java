package fr.unilim.iut.spaceinvaders;

public class Collision {
	
	public boolean detecterCollision(Sprite spriteUne, Sprite spriteDeux) {
		return (abscisseAGaucheInferieurAAbscisseADroite(spriteUne, spriteDeux) &&
				abscisseADroiteSuperieurAAbscisseAGauche(spriteUne, spriteDeux) &&
				ordonneeBasseInferieurAOrdonneeHaute(spriteUne, spriteDeux) &&
				ordonneeHauteSuperieurAOrdonneeBasse(spriteUne, spriteDeux));
	}

	public boolean ordonneeHauteSuperieurAOrdonneeBasse(Sprite spriteUne, Sprite spriteDeux) {
		return spriteUne.ordonneeLaPlusHaute() > spriteDeux.ordonneeLaPlusBasse();
	}

	public boolean ordonneeBasseInferieurAOrdonneeHaute(Sprite spriteUne, Sprite spriteDeux) {
		return spriteUne.ordonneeLaPlusBasse() < spriteDeux.ordonneeLaPlusHaute();
	}

	public boolean abscisseADroiteSuperieurAAbscisseAGauche(Sprite spriteUne, Sprite spriteDeux) {
		return spriteUne.abscisseLaPlusADroite() > spriteDeux.abscisseLaPlusAGauche();
	}

	public boolean abscisseAGaucheInferieurAAbscisseADroite(Sprite spriteUne, Sprite spriteDeux) {
		return spriteUne.abscisseLaPlusAGauche() < spriteDeux.abscisseLaPlusADroite();
	}
}