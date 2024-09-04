

// Caminhao.java
public class Caminhao extends Veiculo {
    private double cargaMaxima;

    public Caminhao(String marca, String modelo, double preco, double cargaMaxima) {
        super(marca, modelo, preco);
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public double calcularSeguro() {
        return getPreco() * 0.07; // 7% do valor do caminhão
    }

    @Override
    public double calcularImposto() {
        return getPreco() * 0.025; // 2.5% do valor do caminhão
    }

    // Getter e Setter
    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }
}

