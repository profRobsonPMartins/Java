# Profº Robson Pereira Martins
# Guia de Início Rápido em Java 🚀

Bem-vindo ao Guia de Início Rápido em Java! Este guia foi criado para ajudar iniciantes a começar a programar em Java de forma fácil e eficaz.

## Comentários em Java 💬

Comentários são utilizados para fornecer informações adicionais no código. Em Java, existem dois tipos principais de comentários:

- **Comentários de Linha Única**: Usados para adicionar explicações breves em uma única linha de código. Eles começam com `//`.

   ```java
   // Este é um comentário de linha única
   int idade = 25; // Outro comentário de linha única
   ```

- **Comentários de Múltiplas Linhas**: Usados para comentar blocos maiores de código. Eles começam com `/*` e terminam com `*/`.

   ```java
   /*
   Este é um comentário de várias linhas.
   Pode ser usado para explicar um bloco inteiro de código.
   */
   ```

## Variáveis em Java 📊

Variáveis em Java são usadas para armazenar dados. Existem diferentes tipos de variáveis em Java, incluindo:

- **int**: Armazena números inteiros.

   ```java
   int idade = 25;
   ```

- **double**: Armazena números decimais.

   ```java
   double altura = 1.75;
   ```

- **String**: Armazena sequências de caracteres.

   ```java
   String nome = "João";
   ```

## Operadores em Java ➕➖

Operadores são símbolos especiais que realizam operações em operandos. Em Java, os operadores incluem:

- **Aritméticos**: Usados para realizar operações matemáticas básicas, como adição, subtração, multiplicação e divisão.

   ```java
   int soma = 5 + 3;
   int subtracao = 10 - 4;
   double multiplicacao = 2.5 * 3.0;
   double divisao = 10.0 / 2.0;
   ```

- **Relacionais**: Usados para comparar valores. Eles retornam um valor booleano, verdadeiro ou falso.

   ```java
   boolean maiorQue = 10 > 5;
   boolean igual = 5 == 5;
   boolean diferente = 10 != 5;
   ```

- **Lógicos**: Usados para combinar expressões condicionais. Os operadores lógicos incluem `&&` (AND), `||` (OR) e `!` (NOT).

   ```java
   boolean condicao1 = (5 > 3) && (10 < 20);
   boolean condicao2 = (5 == 5) || (10 != 5);
   boolean negacao = !(5 > 3);
   ```

## Estrutura Básica de um Programa Java 🏗️

Todo programa Java segue uma estrutura básica:

```java
public class MeuPrograma {
    public static void main(String[] args) {
        // Código aqui
    }
}
```

- `public class MeuPrograma`: Define a classe principal do programa. O nome da classe deve ser o mesmo que o nome do arquivo.

- `public static void main(String[] args)`: O método `main` é o ponto de entrada do programa Java.

## Classes em Java 🏫

As classes são a estrutura fundamental da programação orientada a objetos em Java. Elas são usadas para criar objetos, que são instâncias dessas classes. Aqui está um exemplo simples de uma classe em Java:

```java
public class Pessoa {
    // Variáveis de instância
    String nome;
    int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método
    public void imprimirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
```

## Orientação a Objetos em Java 🧩

Java é uma linguagem de programação orientada a objetos, o que significa que ela se baseia em conceitos como classes e objetos. Aqui está um exemplo simples de como criar um objeto da classe `Pessoa`:

```java
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Maria", 30);
        pessoa1.imprimirInformacoes();
    }
}
```

Isso é apenas uma introdução ao Java! Continue explorando e praticando para se tornar um programador Java proficientes.
