package objetos;

public class objetos {

    // Aqui tenho as caracteristicas do meu futuro objeto
    public static class Carro{
        String marca;
        String modelo;
        int ano;
        String mover;

        // Metodo para exibir informações do carro
        void exibirInformacoes() {
            System.out.println("A marca: " + marca);
            System.out.println("O modelo: " + modelo);
            System.out.println("O ano do veículo: " + ano);
            System.out.println("O veículo está se movimentado: " + mover);
        }

    }

    public static void main(String[] args) {
        // Criando o objeto da classe Carro
        Carro meuCarro = new Carro();

        // Atribuir valores aos atributos do objeto;
        meuCarro.marca = "Honda";
        meuCarro.modelo = "Civic";
        meuCarro.ano = 2012;
        meuCarro.mover = "Em alta velocidade!";

        // Chamar o metodo para exibir as informações do carro
        meuCarro.exibirInformacoes();

    }
}
