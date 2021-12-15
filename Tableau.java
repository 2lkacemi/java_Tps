package Tp3;

import java.util.ArrayList;
import java.util.Random;

public class Tableau {


    //EXO1 Ecrire une méthode qui prend un argument int et retourne un tableau de cette taille, rempli d'entier aléatoire.
    Random ran = new Random();
    public int[] fillArray(int num) {
        int[] tableau = new int[num];
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = ran.nextInt(10);
        }
        return tableau;
    }

    //EXO2 creer table bidi + remplissage
    public double[][] createTable(int xlen, int ylen){
        double[][] table = new double[xlen][ylen];
        for(int i= 0; i<xlen; i++){
            for(int j=0; j<ylen; i++){
                table[i][j] = ran.nextInt(10);
            }
        }
        return table;
    }

    //méthode qui affiche le tableau généré par la première méthode
    public void afficher(double[][] tableau){
        for(int i= 0; i<tableau[i].length; i++){
            for(int j=0; j<tableau[j].length; i++){

                tableau[i][j] = ran.nextInt(10);
                System.out.println("tableau["+i+"]["+j+"]="+tableau[i][j]);

            }
        }
    }



}
