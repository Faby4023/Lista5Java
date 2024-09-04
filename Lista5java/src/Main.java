
    // Main.java
    public class Main {
        public static void main(String[] args) {
            Veiculo carro = new Carro("Ford", "Focus", 50000, 4);
            Veiculo moto = new Moto("Honda", "CB500", 15000, true);
            Veiculo caminhao = new Caminhao("Volvo", "FH16", 200000, 30000);

            System.out.println("Carro:");
            System.out.println("Seguro: R$ " + carro.calcularSeguro());
            System.out.println("Imposto: R$ " + carro.calcularImposto());

            System.out.println("\nMoto:");
            System.out.println("Seguro: R$ " + moto.calcularSeguro());
            System.out.println("Imposto: R$ " + moto.calcularImposto());

            System.out.println("\nCaminhão:");
            System.out.println("Seguro: R$ " + caminhao.calcularSeguro());
            System.out.println("Imposto: R$ " + caminhao.calcularImposto());
        }
    }


