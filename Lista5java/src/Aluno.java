
    public class Aluno extends Pessoa {
        private String matricula;
        private String curso;

        // Construtor
        public Aluno(String nome, int idade, String endereco, String matricula, String curso) {
            super(nome, idade, endereco);
            this.matricula = matricula;
            this.curso = curso;
        }

        // Métodos getters e setters
        public String getMatricula() {
            return matricula;
        }

        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }

        public String getCurso() {
            return curso;
        }

        public void setCurso(String curso) {
            this.curso = curso;
        }

        // Método para exibir informações
        @Override
        public String toString() {
            return super.toString() + ", Matrícula: " + matricula + ", Curso: " + curso;
        }
    }


