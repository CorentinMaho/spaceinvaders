package fr.unilim.iut.spaceinvaders;

public class Collision {
	
	public boolean detecterColision(Missile missile, Envahisseur envahisseur) {
		
		return (hautMissilePlusBasQueBasEnvahisseur(missile, envahisseur)&&missileEstAligneAvecEnvahisseur(missile, envahisseur));
		
	}

	public boolean missileEstAligneAvecEnvahisseur(Missile missile, Envahisseur envahisseur) {
		return toucheParLaGauche(missile, envahisseur)&&toucheParLaDroite(missile, envahisseur);
	}

	public boolean toucheParLaDroite(Missile missile, Envahisseur envahisseur) {
		return missile.abscisseLaPlusAGauche()>envahisseur.abscisseLaPlusADroite();
	}

	public boolean toucheParLaGauche(Missile missile, Envahisseur envahisseur) {
		return missile.abscisseLaPlusADroite()>envahisseur.abscisseLaPlusAGauche();
	}

	public boolean hautMissilePlusBasQueBasEnvahisseur(Missile missile, Envahisseur envahisseur) {
		return missile.ordonneeLaPlusHaute()<envahisseur.ordonneeLaPlusBasse();
	}

}