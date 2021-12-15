package Tp3;
import java.util.*;


public class Index {
    private HashMap<String, Integer> indexer = new HashMap<>();

    public Index() {
    }

    public Index(HashMap<String, Integer> indexer) {
        this.indexer = indexer;
    }

    public void ajouterConsole(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("merci d'introduire le mot a ajouté : ");

        String entree = scanner.nextLine();
        System.out.print("merci d'introduire le num de la page correspondante au mot ajouté:  ");
        Integer numPage = scanner.nextInt();
        //ajouteer l'entree + numero de la page convenable
        indexer.put(entree, numPage);
    }

    public void ajouter(String entree, Integer numPage){
        indexer.put(entree, numPage);
    }



    //on va trier la liste des entrée par ordre alphabétique
    public void liste() {
        List<String> listOfEntries = new ArrayList<>();
        //ajouter les entrees dans une liste
        for (Map.Entry<String, Integer> entry : indexer.entrySet()) {
            String entree = entry.getKey();
            listOfEntries.add(entree);
        }
        // trier la liste alphabétiquement
        Collections.sort(listOfEntries);
        //on va parcourir la liste triée et afficher la valeur correspondante sur le hashmap
        for (int i = 0; i < listOfEntries.size(); i++) {
            System.out.println(listOfEntries.get(i)
                    +":"+indexer.get(listOfEntries.get(i)));
        }
    }

    public HashMap<String, Integer> getIndexer() {
        return indexer;
    }

    public void setIndexer(HashMap<String, Integer> indexer) {
        this.indexer = indexer;
    }


}
