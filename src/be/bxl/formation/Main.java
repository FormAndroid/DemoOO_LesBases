package be.bxl.formation;

import be.bxl.formation.models.Personnage;

public class Main {

    public static void main(String[] args) {

        // On créer une instance 'p1' de type "Personnage"
        Personnage p1 = new Personnage(
                "Zaza",
                "Vanderquack",
                20
        );

        // Le constructeur par "defaut" n'est plus disponible
        // -> Personnage p = new Personnage();

        Personnage p2 = new Personnage(
                "Bilbo",
                "Bessac",
                100,
                "Hobbit"
        );




        Personnage p3 = new Personnage(
                "Donald",
                null,
                15
        );

        System.out.println(p1.getNom());

    }
}
