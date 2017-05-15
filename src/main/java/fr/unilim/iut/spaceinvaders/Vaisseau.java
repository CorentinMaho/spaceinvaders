package fr.unilim.iut.spaceinvaders;

public class Vaisseau {

	int x;
	int y;
	private int hauteur;
	private int longueur;

	public Vaisseau(int longueur, int hauteur) {
		this(longueur, hauteur, 0, 0);
	}

	public Vaisseau(int longueur, int hauteur, int x, int y) {
		this.longueur = longueur;
		this.hauteur = hauteur;
		this.x = x;
		this.y = y;
	}

	public boolean occupeLaPosition(int x, int y) {
		return (estAbscisseCouverte(x) && estOrdonneeCouverte(y));
	}

	public boolean estAbscisseCouverte(int x) {
		return (abscisseLaPlusAGauche() <= x) && (x <= abscisseLaPlusADroite());
	}

	public boolean estOrdonneeCouverte(int y) {
		return (ordonneeLaPlusHaute() <= y) && (y <= ordonneeLaPlusBasse());
	}

	public int ordonneeLaPlusBasse() {
		return this.y;
	}

	public int ordonneeLaPlusHaute() {
		return ordonneeLaPlusBasse() - this.hauteur + 1;
	}

	public int abscisseLaPlusAGauche() {
		return this.x;
	}

	public int abscisseLaPlusADroite() {
		return abscisseLaPlusAGauche() + this.longueur - 1;
	}

	public void seDeplacerVersLaDroite() {
		this.x = abscisseLaPlusAGauche() + 1;

	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void seDeplacerVersLaGauche() {
		this.x = abscisseLaPlusAGauche() - 1;

	}

	public void positionner(int x, int y) {
		this.x = x;
		this.y = y;
	}

}