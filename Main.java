import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        operazioniHashSet();
    }
    public static void operazioniHashSet(){
        //Scrivere una funzione che restituisca un hashset riempito
        Set<String> hashset1 = new HashSet<String>(Arrays.asList("1", "2", "3"));
        System.out.println("HashSet iniziale: " + hashset1);

        //Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
        String quattro = "4";
        hashset1.add(quattro);
        System.out.println("HashSet con oggetto creato e popolato: " + hashset1);

        //Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
        for (String elemento : hashset1){
            if (elemento == quattro){
                hashset1.remove(elemento);
            }
        }
        System.out.println("HashSet con oggetto precedentemente aggiunto eliminato: " + hashset1);

        //Svuotare l'hashset, verificarlo e stampare il risultato
        hashset1.clear();
        System.out.println("HashSet svuotato: " + hashset1);
    }
}
