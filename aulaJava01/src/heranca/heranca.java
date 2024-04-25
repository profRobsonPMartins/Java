package heranca;

public class heranca {
    // Super classe
    public static class Animal {
        //Metodo comer()
        public void comer() {
            System.out.println("O Animal está comendo.");
        }
    }

    // Sub classe (Classe filha)
    public static class Cachorro extends Animal {
        public void latir() {
            System.out.println("O cachorro está latindo");
        }
    }

    public static void main(String[] args) {

        // Em java herança é implementada usando (extends)

        Cachorro meuCachorro = new Cachorro();

        meuCachorro.comer();
        meuCachorro.latir();
    }
}
