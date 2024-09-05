public class Eletronico {

    public abstract class Eletronico {

        private String marca;
        private String modelo;
        private double preco;
        private String descricao;

        public Eletronico(String marca, String modelo, double preco, String descricao) {
            this.marca = marca;
            this.modelo = modelo;
            this.preco = preco;
            this.descricao = descricao;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public abstract void exibirDetalhes();
    }

}
