public class condicionalEncadedada {
    /* Condicionais Encadeadas
        em um controle de fluxo, nem sempre nos limitamos ao se (if) e senão (else), podemos ter uma
        terceira, quarta e ou inúmeras condições.
     
     */

     public static void main(String[] args) {
            int nota = 6; //Condição aplicada
    
            if(nota >= 7) 
                System.out.println("Aprovado"); // Primeira execução.

            else if (nota >5 && nota <7)
            System.out.println("Prova de recuperação."); //Segunda execução, se a primeira não for atendida.

            else
                System.out.println("Reprovado"); // terceira execução, se as anteriores não forem atendidas.
        
     }
}
