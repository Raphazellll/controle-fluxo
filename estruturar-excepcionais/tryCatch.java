
/* Estruturas Excepcionais

    Exceções
        Ao executar o código JAVA, diferentes erros podem acontecer: erros codificados feitos pelo programador,
        erros devido a entrada erradas ou a imprevistos.

        Quando ocorre um erro, o JAVA normalmente para e gera uma mensagem de erro. O termo técnico para isso é:
        JAVA lançará uma exceção (jogará um erro).

        De forma interpretativa em JAVA, um erro é algo irreparável, a aplicação trava ou é encerrada drasticamente. 
        Ja exceções, é um fluxo inesperado da nossa aplicação, exemplo: Quero dividir um valor por zero, querer abrir
        um arquivo que não existe, abrir uma conexão de banco com usuário ou senha inválidos.

        Todos estes cenários e os demais não são erros, mas sim fluxos não previstos pela aplicação.

        É ai que entra mais uma responsabilidade do desenvolvedor, prever situações iguais a estas e realizar o que denominamos
        Tratamento de Exceções    
        
        Mão na massa:
        Vamos trazer o cenário que estudamos na aula sobre Terminal e Argumentos onde via terminal
        informamos alguns dados pessoas.

    Conhecendo algumas exceções já mapeadas
        A linguaguem JAVA dispõe de uma vasta lista de classes que representam exceções, abaixo
        iremos apresentar a mais comuns:

        Nome: java.lang.NullPointerException
        Causa: Quando tentamos obter alguma informação de uma variável NULA.

        Nome:: java.lang.ArithmeticException
        Causa: Quando tentamos dividor um valor por ZERO.

        nome: java.sql.SQLException
        Causa: Quando existe algum erro relacionado a interação com a base de dados.
        
        Nome: java.io.FileNotFoundException
        Causa: Quando tentamos ler ou escrever em um arquivo que não existe.

    Tratamento de exceções:
        E quando inevitavelmente ocorrer uma exceção? Como nós desenvolvedores podemos
        ajustar o nosso algoritovo para aamenizar o ocorrido?

            A instrução TRY permite que você defina um bloco de código para ser testado quanto
            a erros enquanto está sendo executado.

            A instrução CATCH permite definir um bloco de código a ser executado, caso
            ocorra um erro no bloco try

            A instrução FINALLY permite definir um bloco de códigos a ser executado, indedpendente
            de ocorrer um erro ou não. As palavras-chaves TRY-CATCH vêm em pares, a FINALLY sendo
            opcional.

    Estrutura de um bloco com try e catch

        try { 
            // bloco de código condirme esperado 
        }
        catch(Exception e) { 
           // precisamos saber qual exceção 
          // bloco de código que captura as exceções que podem acontecer, em caso de um fluxo não previsto.
        }

    ** Um bloco

 
 */
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class tryCatch {
    public static void main(String[] args) {
        try {
            // criando um objeto scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.nextLine();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();

            // imprimindo os dados obtidos pelo usuario
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos.");
            System.out.println("Minha altura é " + altura + "cm.");
            scanner.close();
        } // fim do try
        catch (InputMismatchException e) // colocando o tipo de erro Imput, que caso ocorra, irá aparecer no terminal.
        {
            System.out.println("Os campos de idade e altura precisam ser numérios.");
        } // fim do catch

    }
}
