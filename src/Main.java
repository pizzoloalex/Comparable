import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Studente> studenti = new ArrayList<>();
//        studenti.add(new Studente("Mario", "Rossi", 4.3));
//        studenti.add(new Studente("Gigi", "Verdi", 7.4));
//        studenti.add(new Studente("Axel", "Nguete", 8.2));

//        Collections.sort(studenti);
//        System.out.println(studenti);
        Classe c1 = new Classe();
        c1.aggiungiStudenti();
        Collections.sort(c1.getStudenti());
        for (Studente s: c1.getStudenti()){
            System.out.println(s);
        }
    }
}
