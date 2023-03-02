import java.util.LinkedList;

public class Caixa {

    LinkedList<Moeda>moedas;
    float dinheiroCredito;

    public Caixa() {
        this.moedas = new LinkedList<>();
        moedas.add(new Moeda(0,(float)0.05));
        moedas.add(new Moeda(0,(float)0.1));
        moedas.add(new Moeda(0,(float)0.2));
        moedas.add(new Moeda(0,(float)0.5));
    }

    void adicionarMoeda(float valor)
    {

        boolean moedaValida = false;
        for (Moeda moeda : moedas) {
            if (valor == moeda.getValor()) {
                moedaValida = true;
                break;
            }

        }
        if(moedaValida)
        {
            dinheiroCredito += valor;
        }
        else {
            System.out.println("Moeda Inválida");

        }
    }

    public void darTroco(float valor)
    {
        float troco = dinheiroCredito - valor;

        System.out.println("Troco");


        while(troco != 0)
        {
            if(troco >= 0.5)
            {
                moedas.get(0).retirarUnidade();
                System.out.println("Moeda - 0,5");
                troco -= 0.5;


                continue;
            }
            if(troco >= 0.2)
            {
                moedas.get(1).retirarUnidade();
                System.out.println("Moeda - 0,2");
                troco -= 0.2;


                continue;


            }
            if(troco >= 0.1)
            {
                moedas.get(2).retirarUnidade();
                System.out.println("Moeda - 0,1");
                troco -= 0.1;


                continue;


            }
            if(troco >= 0.05)
            {
                moedas.get(3).retirarUnidade();
                System.out.println("Moeda - 0,05");
                troco -= 0.05;


            }
        }


    }
}
