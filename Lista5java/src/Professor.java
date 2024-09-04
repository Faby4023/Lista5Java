
    public class Professor extends Pessoa {
        private String disciplina;
        private double salario;

        // Construtor
        public Professor(String nome, int idade, String endereco, String disciplina, double salario) {
            super(nome, idade, endereco);
            this.disciplina = disciplina;
            this.salario = salario;
        }

        // Métodos getters e setters
        public String getDisciplina() {
            return disciplina;
        }

        public void setDisciplina(String disciplina) {
            this.disciplina = disciplina;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }

        // Método para exibir informações
        @Override
        public String toString() {
            return super.toString() + ", Disciplina: " + disciplina + ", Salário: " + salario;
        }
    }


