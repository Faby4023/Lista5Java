
    public class Diretor extends Pessoa {
        private int anosDeExperiencia;

        // Construtor
        public Diretor(String nome, int idade, String endereco, int anosDeExperiencia) {
            super(nome, idade, endereco);
            this.anosDeExperiencia = anosDeExperiencia;
        }

        // Métodos getters e setters
        public int getAnosDeExperiencia() {
            return anosDeExperiencia;
        }

        public void setAnosDeExperiencia(int anosDeExperiencia) {
            this.anosDeExperiencia = anosDeExperiencia;
        }

        // Método para exibir informações
        @Override
        public String toString() {
            return super.toString() + ", Anos de Experiência: " + anosDeExperiencia;
        }
    }


