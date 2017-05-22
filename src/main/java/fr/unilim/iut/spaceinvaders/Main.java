package fr.unilim.iut.spaceinvaders;

import fr.unilim.iut.spaceinvaders.moteurjeu.MoteurGraphique;

public class Main {
	public static void main(String[] args) throws InterruptedException {

	    SpaceInvaders spaceInvaders = new SpaceInvaders(Constante.ESPACEJEU_LONGUEUR, Constante.ESPACEJEU_HAUTEUR);
	    spaceInvaders.initialiserJeu();
	    DessinSpaceInvaders afficheur = new DessinSpaceInvaders(spaceInvaders);

	    MoteurGraphique moteur = new MoteurGraphique(spaceInvaders, afficheur);
	    moteur.lancerJeu(Constante.ESPACEJEU_LONGUEUR, Constante.ESPACEJEU_HAUTEUR);
    }
}
