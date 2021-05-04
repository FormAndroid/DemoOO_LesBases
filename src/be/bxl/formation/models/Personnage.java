package be.bxl.formation.models;

import java.util.Locale;

public class Personnage {

    //region Constante
    public final int ENDURANCE_MAX = 100;
    //endregion

    //region Champs (Field)
    private String nom;
    private String prenom;
    private String espece;
    private int pdvMax;
    private int pdv;
    private int endurance;
    //endregion

    //region Encapsulation -> Securisation de l'acces des champs de la classe
    // - Getters (Accesseurs)
    public String getNom() {
        return this.nom.toUpperCase();
    }
    public String getPrenom() {
        return  this.prenom;
    }
    public String getEspece() {
        return this.espece;
    }
    public int getPdv() {
        return this.pdv;
    }
    public int getPdvMax() {
        return this.pdvMax;
    }
    public String getNomComplet() {
        // Getter calculer -> Valeur basé sur les champs de l'objet'.
        return this.getPrenom() + " " + this.getNom();
    }

    // - Setters (Mutateurs)
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    private void setPdv(int pdv) {
        // Setter privé -> pour une usage dans la classe uniquement !
        this.pdv = (pdv < getPdvMax()) ? pdv : getPdvMax();
    }
    //endregion


    //region Constructeur -> Méthode appeler lors de l'instantiation

    // - Définition d'une méthode constructeur pour créer nos objets
    public Personnage(String prenom, String nom, int pdv) {
        // Il est possible de réaliser un test de validation
        if(pdv <= 0) {
            // throw -> Permet de déclancher une erreur
            throw new IllegalArgumentException("Les pdv doivent être positif");
        }

        // this -> Permet d'interagir avec l'instance actuelle -> L'objet
        this.nom = nom;
        this.prenom = prenom;
        this.endurance = ENDURANCE_MAX;
        this.pdvMax = pdv;
        this.pdv = pdv;
        this.espece = "Humain";
    }

    // - Utilisation de la surcharge de méthode sur le constructeur
    public Personnage(String prenom, String nom, int pdv, String espece) {
        this(prenom, nom, pdv);
        this.espece = espece;
    }
    //endregion
}
