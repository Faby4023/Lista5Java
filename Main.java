public class Main {
    public static String main(String[] args) {

        Mamifero leão = new Mamifero("Leão", 5, "Panthera leo", true);
        Ave papagaio = new Ave("Papagaio", 2, "Amazona", true);
        Reptil cobra = new Reptil("Cobra", 4, "Serpente", true);

        leão.emitirSom();
        papagaio.emitirSom();
        cobra.emitirSom();
    }
}



