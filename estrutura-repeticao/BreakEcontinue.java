public class BreakEcontinue {
    
/* Break e Continue
        Break significa quebrar, parar, frear interromper. E é isso que se faz quando o JAVA
            encontra esse comando pela frente. Continue, como o nome diz, ele 'continua' o laço.
            O comando BREAK interrompe o laço, já o CONTINUE interrope somente a iteração atual.
 */
    public static void main(String[] args) {
        
         for (int numero = 0; numero <=5; numero++) {

            if(numero == 3)
                continue;  //usando o break neste exemplo, ele executa até chegar o numero 3. 
                          // usando o continue neste exemplo, ele executará até chegar o 3, 
                         //pulando esse numero e continuando a contagem.

            System.out.println(numero);
            }
                    
    }
}
