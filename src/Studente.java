public class Studente implements Comparable<Studente>{
    private String nome;
    private String cognome;
    private double media;

    public Studente(String nome, String cognome, double media) {
        this.nome = nome;
        this.cognome = cognome;
        this.media = media;
    }


    /**
     * comparo gli studenti per la media
     * @param studente the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Studente studente){
        return (int) ((int)this.media - studente.media);
    }
}
