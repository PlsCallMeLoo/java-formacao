public class Produto {
    private String nome;
    private float preco;
    int quantidae;

    public Produto(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
        int quantidade = 100;
    }

    public String getNome() {
        return nome;
    }



    public float getPreco() {
        return preco;
    }
}
