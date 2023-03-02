import java.awt.color.ProfileDataException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Maquina maquina1 = new Maquina();
        maquina1.adicionarProduto("Coca Cola", (float) 0.7);
        maquina1.adicionarProduto("Pepsi", (float) 0.65);
        maquina1.adicionarProduto("Iced Tea", (float) 0.6);


        while(true)
        {
            maquina1.mostrarProdutosDisponiveis();

            System.out.println("Insira o produto desjado");

            maquina1.setProdutoEscolhido(leitor.nextInt() - 1);

            System.out.println("Insira o dinheiro");
            maquina1.inserirMoeda(leitor.nextFloat());


            int maisMoeda;

            do {
                System.out.println("Deseja inserir mais moedas?(1-> Sim/ 2-> Não)");
                maisMoeda = leitor.nextInt();
                if(maisMoeda == 1)
                {
                    maquina1.inserirMoeda(leitor.nextFloat());
                }
            } while (maisMoeda == 1);

            if(maquina1.compraAprovada())
            {
                maquina1.realizarCompra();
            }
            else {
                System.out.println("Dinheiro Insuficiente");
                System.out.println(maquina1.caixa.dinheiroCredito);
            }
            maquina1.caixa.dinheiroCredito = 0;
        }
    }
}