public class hierarquiaDasExcecoes {

    /*
     * Hierarquia das Exceções
     * A linguaguem JAVA dispõe de uma variedade de classes que representam
     * exceções, e estas classes são
     * organizadas em uma hierrarquia denominadas Checked and Unchecked Exceptions,
     * ou
     * Exceções Checadas e Não Checadas.
     ** 
     * O que determina uma exceção ser classificada como CHECADA ou NÃO CHECADA?
     * É o risco dela ser disparada logo e você precisar tratá-la, Exemplo:
     * 
     * Vamos imaginar que precisamos realizar de duas maneiras a conversão de uma
     * String
     * para um número, porém o texto contém Afanuméricos.
     * 
     * Number valor;
     * try {
     * valor = NumberFormat.getInstance().parse("a1.75");
     * System.out.println(valor);
     * 
     * } catch (ParseException e) {
     * e.printStackTrace();
     * }
     * 
     * 
     * Exceções Customizadas
     * Nós podemos criar nossas prórpias exceções baseadas em regras de negócios e
     * assim,
     * melhor direcionar quem for utilizar os recursos desenvolvidos no projeto,
     * exemplo:
     * 
     * Imagina que como regra de negócio, para formatar um cep, necessita sempre ter
     * 8 dígitos,
     * contrário, lançará uma exceção que denominamos de "CepInvalorException".
     * 
     * Primeiro criamos nossa exceção:
     * 
     * public calss CepInvalorException extends Exceptions{}
     * 
     * 
     * 
     * 
     * =============================================================================
     * ============================
     * 
     * Exemplo de criação de classe:
     * Primeiro, devemos criar uma classe e colocar o tipo de Exceção: exemplo.
     * "hierarquiaDasExcecoes extends Exception"
     * 
     * 
     * 
     * public class hierarquiaDasExcecoes {
     * 
     * public static void main(String[] args) {
     * try { // en seguida, colocar o try normalmente.
     * String meuCep = formatarCep("2376504");
     * System.out.println(meuCep);
     * } catch (hierarquiaDasExcecoes e) { // o cath com a exceção criada.
     * 
     * System.out.println("O cep não corresponde com as regras de negócio.");
     * }
     * 
     * }
     * 
     * // e finalizar com a condição dela exercutar
     * //normalmente ou com o erro
     * 
     * static String formatarCep(String cep) throws hierarquiaDasExcecoes {
     * if (cep.length() != 8)
     * throw new hierarquiaDasExcecoes();
     * 
     * return "23.756.064";
     * 
     * }
     * }
     * 
     */
}