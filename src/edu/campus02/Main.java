package edu.campus02;

public class Main {

    public static void main(String[] args) {
	// St.Kl.1 20% / St.Kl.2. 16% / St.Kl.3. 8% / Preis 200€, 16%
        int nettoPreis = 200;
        int steuerklasse = 1;
        double steuer1 = 0.02;
        double steuer2 = 0.16;
        double steuer3 = 0.08;
        double steuer = 0;
        double brutto;

                if (steuerklasse == 1) {
                    steuer = nettoPreis * steuer1;
                } else if (steuerklasse == 2) {
                   steuer = nettoPreis* steuer2;
                } else if (steuerklasse == 3) {
                    steuer = nettoPreis* steuer3;
                }
                brutto = nettoPreis + steuer;
                System.out.println("Brutto: " +brutto);

                //dasselbe BSP aber mit Switch! Die Deklaration und Initialisierung bleiben gleich

                switch (steuerklasse) {
                    case 1:
                        steuer= nettoPreis*steuer1;
                        break;
                    case 2:
                        steuer= nettoPreis*steuer2;
                        break;
                    case 3:
                        steuer= nettoPreis*steuer3;
                        break;
                    default:
                        System.out.println("Keine");
                        break;

                }   brutto = nettoPreis + steuer;
                    System.out.println("Brutto: " +brutto);

//Mache Methode, die als Parameter den Preis und die Steuer übernimmt und als Rückgabewert den Bruttopreis ausgibt
        double brPreis;
        brPreis = bruttopreis(200,2);
        System.out.println("Ergebnis " +brPreis);
    }
    public static double bruttopreis (int netto, double steuer) {
        double ergebnis;
        ergebnis = netto + netto*steuer;
        return ergebnis;

    }



}
