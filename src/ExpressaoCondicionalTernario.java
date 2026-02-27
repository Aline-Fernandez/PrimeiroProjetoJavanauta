public class ExpressaoCondicionalTernario {
    public static void main(String[] args) {

        boolean estaChovendo = true;
        boolean temDinheiro = true;
        boolean temCartao = false;

        String mensagem = (temDinheiro) ? "Pede um ifood" : "Então vou fazer um miojo";
        System.out.println(mensagem);
    }
}
