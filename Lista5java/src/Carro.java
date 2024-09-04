
    // Carro.java
    public class Carro extends Veiculo {
        private int numeroDePortas;

        public Carro(String marca, String modelo, double preco, int numeroDePortas) {
            super(marca, modelo, preco);
            this.numeroDePortas = numeroDePortas;
        }

        @Override
        public double calcularSeguro() {
            return getPreco() * 0.03; // 3% do valor do carro
        }

        @Override
        public double calcularImposto() {
            return getPreco() * 0.02; // 2% do valor do carro
        }

        // Getter e Setter
        public int getNumeroDePortas() {
            return numeroDePortas;
        }

        public void setNumeroDePortas(int numeroDePortas) {
            this.numeroDePortas = numeroDePortas;
        }
    }


