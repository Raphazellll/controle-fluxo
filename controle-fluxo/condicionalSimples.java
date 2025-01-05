public class condicionalSimples {

/* Estrutura condicional
        A estrutura condicional possibilita a escolha de um grupo de ações e comportamentos a serem
    executadas quando determinadas. Condições são ou não satifeitas. A estrutura condicional pode ser
    Simples ou Composta.

    Condicional Simples
        Ocorre quando uma validação de execução de fluxo somente quando a condição for positiva,
    consideramos como estrutura SIMPLES.
*/

public static void main(String[] args) throws Exception {
    double saldo = 25.0;
    double valorSolicitado = 17.0;

    if(valorSolicitado < saldo) //controle de fluxo IF, que compara as variáveis 
                                //a condição precisa ser verdadeira para ter exito na execução.
    
    saldo = saldo - valorSolicitado; //reatribuindo o valor de saldo.

System.out.println(saldo); //saída do novo valor alterado.
    }
}

   

