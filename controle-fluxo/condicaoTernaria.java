public class condicaoTernaria {
   
   /* Condição ternária
        Como vimos em operadores, podemos abreviar nossos algorítimo condicional refatorando (melhorando) 
        com o concecito de operador ternário.
     
        ? = True 
        : = False
    */
   
   
    public static void main(String[] args) {
        int nota1 = 3;                  
            String resultado = nota1 >=7 ? "Aprovado" // IF
            : nota1 >=5 && nota1 <7 ? "Recuperação"   // ELSE IF
            : "Reprovado";                            // ELSE
            System.out.println(resultado);
    }
}
