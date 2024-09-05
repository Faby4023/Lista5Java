public class Smartphone {

    public class Smartphone extends Eletronico {

        private int capacidadeBateria; // Capacidade da bateria em mAh
        private int armazenamento; // Armazenamento em GB

        public Smartphone(String marca, String modelo, double preco, String descricao, int capacidadeBateria, int armazenamento) {
            super(marca, modelo, preco, descricao);
            this.capacidadeBateria = capacidadeBateria;
            this.armazenamento = armazenamento;
        }

        public int getCapacidadeBateria() {
            return capacidadeBateria;
        }

        public void setCapacidadeBateria(int capacidadeBateria) {
            this.capacidadeBateria = capacidadeBateria;
        }

        public int getArmazenamento() {
            return armazenamento;
        }

        public void setArmazenamento(int armazenamento) {
            this.armazenamento = armazenamento;
        }
        @Override

        public String exibirDetalhes() {

            return "Smartphone:";
            return "Marca: " + getMarca();
            return"Modelo: " + getModelo();
            return"Preço: R$ " + getPreco();
            return"Descrição: " + getDescricao();
            return"Capacidade da Bateria: " + capacidadeBateria + " mAh";
            return"Armazenamento: " + armazenamento + " GB";
        }
    }

}
