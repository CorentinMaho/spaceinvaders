package fr.unilim.iut.spaceinvaders;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import fr.unilim.iut.spaceinvaders.utils.MissileException;

public class CollisionTest {
 
private SpaceInvaders spaceinvaders;

    @Before
    public void initialisation() {
   spaceinvaders = new SpaceInvaders(15, 10);
    }
    
@Test
public void test_CollisionTest() throws MissileException{
spaceinvaders.positionnerUnNouveauVaisseau(new Dimension(7, 2), new Position(5, 9), 1);
spaceinvaders.positionnerUnEnvahisseur(new Dimension(1,1), new Position(8,0), 1);
spaceinvaders.tirerUnMissile(new Dimension(3, 2), 1);
for (int i = 1; i <= 6; i++) {
spaceinvaders.deplacerMissile();
}
assertEquals("" +
".......MMM.....\n" + 
".......MMM.....\n" +
"...............\n" + 
"...............\n" +
"...............\n" +
"...............\n" + 
"...............\n" +
"...............\n" + 
".....VVVVVVV...\n" + 
".....VVVVVVV...\n" , spaceinvaders.recupererEspaceJeuDansChaineASCII());
}
}