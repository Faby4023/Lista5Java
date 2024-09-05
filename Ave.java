
public class Ave extends Animal {

    private boolean podeVoar;

    public Ave(String nome, int idade, String especie, boolean podeVoar) {
        super(nome, idade, especie);
        this.podeVoar = podeVoar;
    }

    public boolean isPodeVoar() {
        return podeVoar;
    }

    public void setPodeVoar(boolean podeVoar) {
        this.podeVoar = podeVoar;
    }

    @Override
    public String emitirSom() {
        return "A ave está piando.";
    }
}

