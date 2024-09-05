public class Televisao {

    public class Televisao extends Eletronico {

        private int tamanhoTela; // Tamanho da tela em polegadas
        private boolean smart; // Se é uma TV smart

        public Televisao(String marca, String modelo, double preco, String descricao, int tamanhoTela, boolean smart) {
            super(marca, modelo, preco, descricao);
            this.tamanhoTela = tamanhoTela;
            this.smart = smart;
        }

        public int getTamanhoTela() {
            return tamanhoTela;
        }

        public void setTamanhoTela(int tamanhoTela) {
            this.tamanhoTela = tamanhoTela;
        }

        public boolean isSmart() {
            return smart;
        }

        public void setSmart(boolean smart) {
            this.smart = smart;
        }

        @Override
        public String exibirDetalhes() {
            return "Televisão:";
            return"Marca: " + getMarca();
            return"Modelo: " + getModelo();
            return"Preço: R$ " + getPreco();
            return"Descrição: " + getDescricao();
            return"Tamanho da Tela: " + tamanhoTela + " polegadas";
            return"Smart TV: " + (smart ? "Sim" : "Não");
        }
    }

}
