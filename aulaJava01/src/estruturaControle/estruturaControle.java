package estruturaControle;

public class estruturaControle {

    public static void main(String[] args) {

        // Estrutura de controle
        // Usamos na programação para controlar fluxos de execução
        // Ela permite que você tome decisões

        // If else (Se e se não)
        int idade = 15;
        if (idade >= 18) {
            System.out.println("você é maior de idade!");
        } else {
            System.out.println("Acesso negado!");
        }

        // if else de forma compacta
        int idade02 = 15;

        if (idade02 == 18) {
            System.out.println("Você é menor de idade!");
        } else {
            if (idade02 == 15) {
                System.out.println("Você é menor de idade, porém não é criança!");
            } else {
                System.out.println("Você não pode acessar, pois ainda é criança!");
            }
        }

        // for (para) laço de repetição
        // i = indíce / indice menor que 5 / contar de 1 em 1
        for (int i = 0; i < 50; i++) {
            System.out.println("Contagem: " + i);
        }

    }
}
