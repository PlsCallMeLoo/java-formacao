import java.util.LinkedList;

public class Maquina {

    LinkedList<Produto>produtos;
    Caixa caixa;
    int produtoEscolhido;

    public void setProdutoEscolhido(int produtoEscolhido) {
        this.produtoEscolhido = produtoEscolhido;
    }

    public Maquina() {
        this.produtos = new LinkedList<>();
        this.caixa = new Caixa();


    }

    public void adicionarProduto(String nome, float preco)
    {
        produtos.add(new Produto(nome, preco));
    }

    public LinkedList<Produto> getProdutos() {
        return produtos;
    }

    public void mostrarProdutosDisponiveis()
    {
        for (int i = 0;i < produtos.size();i++)
        {
            System.out.println(i + 1 + " - " + produtos.get(i).getNome());
        }
    }

    public void inserirMoeda(float valor)
    {
        caixa.adicionarMoeda(valor);
    }

    public boolean compraAprovada()
    {
        return caixa.dinheiroCredito >= produtos.get(produtoEscolhido).getPreco();
    }

    public void realizarCompra ()
    {
        produtos.get(produtoEscolhido).quantidae--;

        System.out.println(produtos.get(produtoEscolhido).getNome() + "comprada");


        if(caixa.dinheiroCredito > produtos.get(produtoEscolhido).getPreco())
        {
            caixa.darTroco(produtos.get(produtoEscolhido).getPreco());
        }
    }



}
