public class condicionalComposta {
    /* Condicional Composta
            Algumas vezes o nosso programa deverá seguir mais de uma jornada de execuções
            condicionado a uma regra ded negócio, este cenário é denominado: Estruturas Condicional
            Composta. 
     */

    public static void main(String[] args) {
        
        int nota = 6; //Condição aplicada

        if(nota >= 7) {
            System.out.println("Aprovado"); // Primeira execução.

    }else
            System.out.println("Reprovado"); // Segunda execução, se a primeira não for atendida.
    }
}


