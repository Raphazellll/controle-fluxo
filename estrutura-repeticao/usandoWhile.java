import java.util.concurrent.ThreadLocalRandom; //

public class usandoWhile {

/* WHILE
        O laço while (tradução: enquanto) determina que enquanto uma condição for válida, o bloco de código será
            executado. O laço while testa a condição antes de executar o código, logo, caso a condição seja inválida
            no primeiro teste o bloco nem será executado.
        
        A estrutura de sintaxe do controle de repetição while é exibida abaixo:

        //Estrutura do controle de fluxo while

    while (expressão boleana de validação)
    {
    // comando que será executado até que a 
    // expressão de validação torne-se falsa.
    }

 */

 public static void main(String[] args) {

    double mesada = 50.0;


        while(mesada > 0) {
            double valorDoce = valorAleatorio();
                
                if (valorDoce > mesada)
                    valorDoce = mesada; //tira o valor negativo do while.
                System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho.");
                mesada = mesada - valorDoce;

             System.out.println("Mesada: " + mesada);
            System.out.println("Joãozinho gastou toda a sua mesada em doces.");
        }
      
      }
   
    private static double valorAleatorio() {
    return ThreadLocalRandom.current().nextDouble(2, 8);
    }
    
} // Final da classe.
