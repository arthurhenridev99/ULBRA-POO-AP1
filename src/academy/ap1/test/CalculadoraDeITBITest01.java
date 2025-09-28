package academy.ap1.test;

import academy.ap1.domain.CalculadoraDeITBI;

public class CalculadoraDeITBITest01 {
    public static void main(String[] args) {
        CalculadoraDeITBI calculadoraDeITBI = new CalculadoraDeITBI();

        calculadoraDeITBI.transacao();
        calculadoraDeITBI.venal();
        calculadoraDeITBI.porcentagem();
        calculadoraDeITBI.calculoImposto();
    }
}
