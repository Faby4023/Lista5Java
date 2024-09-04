
    // Moto.java
    public class Moto extends Veiculo {
        private boolean temAntirroubo;

        public Moto(String marca, String modelo, double preco, boolean temAntirroubo) {
            super(marca, modelo, preco);
            this.temAntirroubo = temAntirroubo;
        }

        @Override
        public double calcularSeguro() {
            double taxaBase = 0.05; // 5% do valor da moto
            if (temAntirroubo) {
                taxaBase -= 0.01; // Desconto de 1% se tiver antirroubo
            }
            return getPreco() * taxaBase;
        }

        @Override
        public double calcularImposto() {
            return getPreco() * 0.015; // 1.5% do valor da moto
        }

        // Getter e Setter
        public boolean isTemAntirroubo() {
            return temAntirroubo;
        }

        public void setTemAntirroubo(boolean temAntirroubo) {
            this.temAntirroubo = temAntirroubo;
        }
    }


