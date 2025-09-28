package academy.ap1.GeradorDeTabuada.domain;

import java.util.Scanner;

public class GeradorDeTabuada {
    private int numero;
    private int multiplica;

    public void tabuada() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Digite o número da tabuada que você quer: (Multiplicamos esse número até 10x)");
        numero = sc1.nextInt();

        for (int i = 0; i < 11; i++) {
            multiplica = numero * i;
            System.out.println(+getNumero()+" x "+i+" = "+getMultiplica());
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getMultiplica() {
        return multiplica;
    }

    public void setMultiplica(int multiplica) {
        this.multiplica = multiplica;
    }
}
