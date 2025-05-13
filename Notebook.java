package ads.aedAtividadeOo;

public class Notebook extends Produto {

    private int tempoDeBateria;

    Notebook(String modelo, String cor, double preco, Categoria categoria, int tempoDeBateria) {
        super(modelo, cor, preco, categoria);
        this.tempoDeBateria = tempoDeBateria;
    }

    public int getTempoDeBateria() {
        return tempoDeBateria;
    }

    public void setTempoDeBateria(int tempoDeBateriaInformado) {
        tempoDeBateria = tempoDeBateriaInformado;
    }

    public void cadastrarProduto(int resposta) {

    }

    @Override
    String getInformacoes() {
        return "\nTIPO: " + categoria.nome +
                "\nID: " + categoria.id +
                "\nMODELO: " + modelo +
                "\nCOR: " + cor +
                "\nPREÇO: R$ " + preco +
                "\nBATERIA: " + tempoDeBateria + " horas";
    }

    @Override
    public String toString() {
        String resultado = "PRODUTO CADASTRADO" + getInformacoes();

        return resultado;
    }

}
