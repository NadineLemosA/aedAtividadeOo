package ads.aedAtividadeOo;

public class Desktop extends Produto {

    protected int potenciaDaFonte;

    Desktop(String modelo, String cor, double preco, Categoria categoria, int potenciaDaFonte) {
        super(modelo, cor, preco, categoria);
        this.potenciaDaFonte = potenciaDaFonte;
    }

    public int getPotenciaDaFonte() {
        return potenciaDaFonte;
    }

    public void setPotenciaDaFonte(int potenciaInformada) {
        potenciaDaFonte = potenciaInformada;
    }

    @Override
    public void cadastrarProduto(int resposta) {

    }

    @Override
    String getInformacoes() {
        return "\nTIPO: " + categoria.nome +
                "\nID: " + categoria.id +
                "\nMODELO: " + modelo +
                "\nCOR: " + cor +
                "\nPREÇO: R$ " + preco +
                "\nFONTE: " + potenciaDaFonte + "W";
    }

    @Override
    public String toString() {
        String resultado = "PRODUTO CADASTRADO" + getInformacoes();

        return resultado;
    }

}
