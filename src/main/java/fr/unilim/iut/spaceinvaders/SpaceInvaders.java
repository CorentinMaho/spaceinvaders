package fr.unilim.iut.spaceinvaders;

public class SpaceInvaders {

	final int longueur;
	final int largeur;
	
	public SpaceInvaders(int longueur, int largeur){
		if (longueur < 0){
			throw new IllegalArgumentException("longueur > 0");
		}
		if (largeur < 0){
			throw new IllegalArgumentException("largeur > 0");
		}
		
		this.longueur=longueur;
		this.largeur=largeur;
	}
}
