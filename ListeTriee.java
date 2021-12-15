package Tp3;

import java.util.LinkedList;

//classe ListeTriée qui hérite de LinkedList
public class ListeTriee extends LinkedList {

    private LinkedList<String> liste = new LinkedList<>();
    //constructeur par défaut
    public ListeTriee() {
    }

    //constructeur parametrée
    public ListeTriee(LinkedList<String> liste) {
        this.liste = liste;
    }

    //si la liste est vide on ajoute un elt sinon on compare avec les elts de la liste et on ajoute
    //l'elt a l'index de l'elt qui est plus "petit" alphabetiquement que la chaine entree en para

    public void ajoute(String chaine) {
        int index = 0;
        if (liste.isEmpty()) {
            liste.add(chaine);
        } else {
            for (int j = 0; j < liste.size(); j++) {                                 //["bb, "ff]
                if (chaine.compareTo(String.valueOf(liste.get(j))) < 0) {
                    liste.add(index, chaine);
                    break;
                }
                index++;
            }
        }
    }

    public void affiche() {
        for (String s : liste) {
            System.out.println(s);
        }
    }

    public LinkedList<String> getListe() {
        return liste;
    }

    public void setListe(LinkedList<String> liste) {
        this.liste = liste;
    }
}
