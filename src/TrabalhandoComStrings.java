public class TrabalhandoComStrings {
    public static void main(String[] args) {
  String nome = "Aline ";
  String sobrenome = "Fernandes ";

  int tamanhoString = nome.length();
  boolean saoIguais = nome.equals(sobrenome);
  String nomeCompleto = nome.concat(sobrenome);


        System.out.println("Olá " + nome.toUpperCase() + " Seu nome tem " + tamanhoString + " caracteres");
        System.out.println("Os nome são iguais: " + saoIguais);
        System.out.println("Nome completo: " + nomeCompleto);
    }
}
