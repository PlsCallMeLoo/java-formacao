public class Moeda {

    int quantidade;
    float valor;

    public Moeda(int quantidade, float valor) {
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public void adicionarUnidade() {
        quantidade++;
    }

    public void retirarUnidade() {
        quantidade--;
    }


    public float getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
