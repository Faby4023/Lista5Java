public class Computador {

    public class Computador extends Eletronico {

        private String tipoProcessador; // Tipo de processador (e.g., Intel i7)
        private int memoriaRAM; // Memória RAM em GB

        public Computador(String marca, String modelo, double preco, String descricao, String tipoProcessador, int memoriaRAM) {
            super(marca, modelo, preco, descricao);
            this.tipoProcessador = tipoProcessador;
            this.memoriaRAM = memoriaRAM;
        }

        public String getTipoProcessador() {
            return tipoProcessador;
        }

        public void setTipoProcessador(String tipoProcessador) {
            this.tipoProcessador = tipoProcessador;
        }

        public int getMemoriaRAM() {
            return memoriaRAM;
        }

        public void setMemoriaRAM(int memoriaRAM) {
            this.memoriaRAM = memoriaRAM;
        }

        @Override
        public String exibirDetalhes() {
           return "Computador:";
            return"Marca: " + getMarca();
            return"Modelo: " + getModelo();
            return"Preço: R$ " + getPreco();
            return"Descrição: " + getDescricao();
            return"Processador: " + tipoProcessador;
            return"Memória RAM: " + memoriaRAM + " GB";
        }
    }

}
