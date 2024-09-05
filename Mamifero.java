

public class Mamifero extends Animal {

    private boolean temPelo;

    public Mamifero(String nome, int idade, String especie, boolean temPelo) {
        super(nome, idade, especie);
        this.temPelo = temPelo;
    }

    public boolean isTemPelo() {
        return temPelo;
    }

    public void setTemPelo(boolean temPelo) {
        this.temPelo = temPelo;
    }

    @Override
    public String emitirSom() {
        return"O mamífero está fazendo um som.";
    }
}





