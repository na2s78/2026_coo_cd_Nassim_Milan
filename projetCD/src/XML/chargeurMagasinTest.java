package XML;


import java.io.FileNotFoundException;
import donnees.Magasin;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;



public class chargeurMagasinTest {

    private static final String REPERTOIRE_VALIDE = "fichiers/";
    private static final String REPERTOIRE_INVALIDE = "repertoire_inexistant/";

    public void testRepertoireValide_MagasinNonNull() throws FileNotFoundException {
        ChargeurMagasin chargeur = new ChargeurMagasin(REPERTOIRE_VALIDE);
        Magasin magasin = chargeur.chargerMagasin();
        assertNotNull(magasin);
    }

    public void testRepertoireValide_BonneTaille() throws FileNotFoundException {
        ChargeurMagasin chargeur = new ChargeurMagasin(REPERTOIRE_VALIDE);
        Magasin magasin = chargeur.chargerMagasin();
        assertEquals(3, magasin.getNombreCds());
    }

}
