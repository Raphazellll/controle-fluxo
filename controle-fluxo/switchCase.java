
public class switchCase {
    /*
     * Switch Case
     * A estrutura switch compara o valor de cada caso com o da variável
     * sequencialmente,
     * e sempre que encontra um valor correspondente, executa o código associado ao
     * caso.
     * Para evitar que as comparações continuem a ser executadas após um caso
     * correspondente ter
     * sido encontrado, acrecentamos o comando BREAK no final de cada bloco de
     * código.
     * O comando BREAK, quando executado, encerra a execução da estrutura onde ele
     * se encontra.
     * 
     * EXEMPLO:
     * 
     * String sigla = "M";
     * 
     * switch (sigla) {
     * 
     * case "P" :
     * System.out.println("PEQUENO"); //se não for imprimir, passará para o próximo
     * break; //até que a condição seja atendida. ai acionará
     * case "M" : //o comando BREAK e irá parar a aplicação.
     * System.out.println("MÉDIO");
     * break;
     * case "G" :
     * System.out.println("GRANDE");
     * default:
     * System.out.println("INDEFINIDO");
     * 
     * }
     * 
     * ======================================
     * 
     * SWITCH CASE USANDO IF
     * 
     * String plano = "M";
     * 
     * if(plano == "B") {
     * System.out.println("100 Minutos de ligação e 1GB Internet.");
     * } else if(plano == "M") {
     * System.out.println("150 Minutos ded ligação e 5GB Internet.");
     * System.out.println("Whatsapp e Instagram Liberados.");
     * } else if (plano == "T") {
     * System.out.println("300 Minutos ded ligação e 15GB Internet.");
     * System.out.println("Whatsapp, Instagram e Twitter Liberados.");
     * System.out.println("10GB Para Vídeos no Youtube.");
     * } else
     * System.out.println("Plano inexistente.");
     */

    public static void main(String[] args) {

        String plano = "M";
        switch (plano) {

            case "B":
                System.out.println("100 Minutos de ligação e 1GB Internet.");
                break;
            case "M":
                System.out.println("150 Minutos ded ligação e 5GB Internet.");
                System.out.println("Whatsapp e Instagram Liberados.");
                break;
            case "T":
                System.out.println("300 Minutos ded ligação e 15GB Internet.");
                System.out.println("Whatsapp, Instagram e Twitter Liberados.");
                System.out.println("10GB Para Vídeos no Youtube.");
                break;
            default:
                System.out.println("Plano inexistente.");
        }

    }

}
