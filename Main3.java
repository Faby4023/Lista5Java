public class Main3 {

        public static void main(String[] args) {
            
            Computador computador = new Computador("Dell", "XPS 15", 8000.00, "Laptop de alto desempenho com processador i7", "Intel i7", 16);
            Televisao televisao = new Televisao("Samsung", "QLED 55\"", 5000.00, "Televisão 4K Smart TV", 55, true);
            Smartphone smartphone = new Smartphone("Apple", "iPhone 14", 7000.00, "Smartphone com iOS e 128GB de armazenamento", 3200, 128);

            computador.exibirDetalhes();
            return;
            televisao.exibirDetalhes();
            return;
            smartphone.exibirDetalhes();
            return;
        }
    }


