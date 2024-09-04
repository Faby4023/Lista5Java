
    public class Main2 {
        public static void main(String[] args) {
            // Criando instâncias
            Aluno aluno = new Aluno("João Silva", 20, "Rua A, 123", "2024001", "Matemática");
            Professor professor = new Professor("Maria Oliveira", 45, "Rua B, 456", "Física", 5000.00);
            Diretor diretor = new Diretor("Carlos Pereira", 50, "Rua C, 789", 15);

            // Exibindo informações
            System.out.println(aluno);
            System.out.println(professor);
            System.out.println(diretor);
        }
    }


