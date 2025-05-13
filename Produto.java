package ads.aedAtividadeOo;

public abstract class Produto {
    String modelo;
    String cor;
    double preco;
    Categoria categoria;

    Produto(String modelo, String cor, double preco, Categoria categoria) {
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
        this.categoria = categoria;
    }

    abstract String getInformacoes();

    abstract void cadastrarProduto(int resposta);
}
