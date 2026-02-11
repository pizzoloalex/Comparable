import java.util.ArrayList;

public class Classe {
    private ArrayList<Studente> studenti = new ArrayList<>();

    public ArrayList<Studente> getStudenti() {
        return studenti;
    }

    public void aggiungiStudenti(){
        studenti.add(new Studente("Mario", "Rossi", 3.6));
        studenti.add(new Studente("Gigi", "Verdi", 7.9));
        studenti.add(new Studente("Nicolo", "Blu", 3.4));
    }
}
