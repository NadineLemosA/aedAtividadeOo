package ads.aedAtividadeOo;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TelaCadastro {

    public void mostraMenu() {

        JFrame frame = new JFrame("JOptionPane exemplo");

        Object[] opcoes = { "DESKTOP", "NOTEBOOK" };

        int categoriaEscolhida = JOptionPane.showOptionDialog(frame,
                "Escolha o produto que quer cadastrar:  ",
                ">>> Cadastrar produto <<< ",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                null);

        cadastraProduto(categoriaEscolhida, frame);

        frame.dispose();
    }

    public void cadastraProduto(int categoriaEscolhida, JFrame frame) {
        String modeloProduto = JOptionPane.showInputDialog("Qual o modelo do produto? ");
        String corProduto = JOptionPane.showInputDialog("Qual a cor do produto? ");
        String precoProduto = JOptionPane.showInputDialog("Qual o preço do produto? ");
        String idProduto = JOptionPane.showInputDialog("Qual o ID do produto? ");

        if (categoriaEscolhida == 0) {
            cadastrarDesktop(modeloProduto, corProduto, precoProduto, idProduto, frame);
        } else {
            cadastrarNotebook(modeloProduto, corProduto, precoProduto, idProduto, frame);
        }

    }

    public void cadastrarNotebook(String modeloProduto, String corProduto, String precoProduto, String idProduto,
            JFrame frame) {
        Categoria categoriaCadastrada = new Categoria("Notebook", Integer.valueOf(idProduto));
        String tempoDeBateriaProduto = JOptionPane.showInputDialog("Qual o tempo de bateria? ");
        Notebook notebook = new Notebook(modeloProduto, corProduto, Double.parseDouble(precoProduto),
                categoriaCadastrada,
                Integer.parseInt(tempoDeBateriaProduto));

        JOptionPane.showMessageDialog(frame, notebook);
    }

    public void cadastrarDesktop(String modeloProduto, String corProduto, String precoProduto, String idProduto,
            JFrame frame) {
        Categoria categoriaCadastrada = new Categoria("Desktop", Integer.valueOf(idProduto));
        String potenciaDaFonteProduto = JOptionPane.showInputDialog("Qual a potencia da fonte? ");
        Desktop desktop = new Desktop(modeloProduto, corProduto, Double.parseDouble(precoProduto), categoriaCadastrada,
                Integer.parseInt(potenciaDaFonteProduto));

        JOptionPane.showMessageDialog(frame, desktop);
    }
}
