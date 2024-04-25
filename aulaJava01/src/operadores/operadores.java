package operadores;

public class operadores {
    

    public static void main(String[] args) {
        
        // Operadores aritimeticos
        System.out.println("Divisão");
        // Divisao
        int numero01 = 10;
        int numero02 = 2;
        int resultadoDivisao = numero01 / numero02;
        // Imprimir no terminal
        System.out.println(" 10 dividido por 2 será igual a: " + resultadoDivisao );

        System.out.println(" ");
        System.out.println("Adição");
        // Adição
        int numero03 = 20;
        int numero04 = 10;
        int resultadoAdicao = numero03 + numero04;
        System.out.println(" A soma de 20 + 10 é: " + resultadoAdicao );

        System.out.println(" ");
        System.out.println("Multiplicação");
        // Multiplicação
        int numero05 = 10;
        int numero06 = 10;
        int resultadoMultiplicacao = numero05 * numero06;
        System.out.println("A multiplicação de 10 x 10 é; " + resultadoMultiplicacao);

        System.out.println("");
        System.out.println("Porcentagem");
        // Porcentagem
        int numero07 = 10;
        int numero08 = 100;
        int resultadoPorcentagem = numero07 % numero08;
        System.out.println("O resultado da porcentagem é: " + resultadoPorcentagem);

        // Subtração
        System.out.println("");
        System.out.println("Subtração");
        int numero09 = 250;
        int numero10 = 29;
        int resultadoSubtracao = numero09 - numero10;
        System.out.println("O resultado da subtração de 250 - 29 é: " + resultadoSubtracao);
    }
}
