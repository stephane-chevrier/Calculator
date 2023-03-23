package campus;

public class Calculateur {


    public int division (int a, int b) {
        try {
            return a / b;
        } catch (Exception e ) {
            System.out.println("impossible de calculer un entier qui est égal à " + a + " / " + b);
            throw e;
        }
    }

}
