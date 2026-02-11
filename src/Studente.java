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
     * compareTo gli dice al colletions come fare il sort
     * comparo gli studenti per la media decrescente(prima riferimento al parametro)
     * crescente (prima riferimento alla classe)
     * @param studente the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Studente studente){
        return Double.compare(this.media,studente.media);
    }

    @Override
    public String toString() {
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", media=" + media +
                '}';
    }
}
