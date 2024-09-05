
public class Reptil extends Animal {

    private boolean temEscamas;

    public Reptil(String nome, int idade, String especie, boolean temEscamas) {
        super(nome, idade, especie);
        this.temEscamas = temEscamas;
    }

    public boolean isTemEscamas() {
        return temEscamas;
    }
    public void setTemEscamas(boolean temEscamas) {
        this.temEscamas = temEscamas;
    }

    @Override
    public String emitirSom() {
        return "O réptil está fazendo um som.";
    }
}


