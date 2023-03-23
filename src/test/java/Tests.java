import campus.Calculateur;
import org.junit.Test;
import static org.junit.Assert.*;

public class Tests {



    /**
     * Methode de test la methode Calculateur.division
     */
    @Test
    public void testDivision () {

        // initialisation variables et objets locales
        int a, b;
        // Il est preferable de creer l'instance a l'interieur de la method de test
        Calculateur calculateur = new Calculateur();

        // 1er test : 2 nombres entiers qui se divisent
        a = 4;
        b = 2;
        assertEquals(calculateur.division(a,b), 2);

        // 2ème test : le resultat n'est pas un entier, la difference est-elle inferieur a "delta" ?
        a = 4;
        b = 3;
        assertEquals(calculateur.division(a,b),(double)4/3,1);

        // 3ème test : le cas d'une division par zero est-elle geree ?
        assertThrows(Exception.class, () -> {calculateur.division(4,0);});

    }
}
