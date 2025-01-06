public class repeticaoFor {

/* Estruturas de repetição
        Laços de repetição, também conhecidos como laços de iteração ou simplesmente loops,
    são comandos presentes no bloco sejam repetidos diversas vezes.

    *For: (para)
    *While (enquanto)
    *Do While (faça enquanto)

    FOR:
        O comando For (na tradução literal é "para") permite que uma variável contadora seja testada
    e incrementada a cada iteração, sendo essas informações definidas na chamada do comando. 
    O comando for recebe como entrada uma variável contadora, a condição e o valor de incrementação.

        A estrutura de sintaxe do controle de repetição FOR é exibida abaixo:

        // estrutura do controle de fluxo FOR
            for (bloco de inicialização; expressão booleana de validação; 
                    bloco de atualização ou incrementação)
                
                { comando que será executado até que

                } a expressão de validação torne-se falsa


            

 */

 public static void main(String[] args) {
         for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
            System.out.println("Contando carneirinhos: " + carneirinhos);
         }

         System.out.println("Joaozinho dormiu...");

 }


}
