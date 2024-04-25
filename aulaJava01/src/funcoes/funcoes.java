package funcoes;

public class funcoes {

    //Função de soma
    public static int soma(int num1, int num2){
        return num1 + num2;
    }
    //Função de subtração
    public static int subtracao(int num3, int num4){
        return num3 - num4;
    }
    
    public static void main(String[] args) {
        
        // Vamos conhecer funções em java ou *métodos*
       int resultado = soma(29, 72);
       System.out.println("A soma das variaveis num1 e num2 é: " + resultado);
        
       //Vamos chamar a função para imprimir a subtração no terminal
       int resultado02 = subtracao(100, 789);
       System.out.println("A subtração de num3 - num4 é de: " + resultado02);
    }

    
}
