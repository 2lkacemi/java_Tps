package Tp3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestIndex {
    public static void main(String[] args) {


        Index index = new Index();
        // (java, 20), (objet, 11), (classe, 13), (polymorphisme, 25)
        index.ajouter("java",20);
        index.ajouter("objet", 11);
        index.ajouter("classe", 13);
        index.ajouter("polymorphisme", 25);

        index.liste();

    }

}
