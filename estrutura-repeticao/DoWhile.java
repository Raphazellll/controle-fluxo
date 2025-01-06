import java.util.Random;

public class DoWhile {

/* Do While
        O laço DO / WHILE (tradução: faça, enquanto), assim como o laço while, considera que enquanto uma
            determinada condição for válida o bloco de código será executado. Entretanto, DO / WHILE testa
            a condição apóos executar o código, sendo assim, mesmo que a condição seja considerada inválida no primeiro
            teste de bloco, será executado pelo menos uma vez.
 
    A estrutura de sintaxe do controle de repetição DO / WHILE é exibida abaixo:

    //Estrutura do controle de fluxo do while

    do 
    {
        //comando que será executado até que a 
        //expressão de validação torne-se falsa
    }
    while (expressão booleana de validação);
 */
    public static void main(String[] args) {
        System.out.println("Discando...");

    do { //executando repetidas vezes até alguem atender
        System.out.println("Telefone tocando");

    } while (tocando());

        System.out.println("Alô !!!");

    }
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        //negando o ato de continuar tocando
        return ! atendeu; //sinal de exclamação ! nega um booleano.
    }

    
}
