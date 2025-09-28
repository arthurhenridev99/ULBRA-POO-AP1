package academy.ap1.CalculadoraDeDesconto.test;

import academy.ap1.CalculadoraDeDesconto.domain.CalculadoraDeDesconto;

public class CalculadoraDeDescontoTest01 {
    public static void main(String[] args) {
        CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();
        calculadoraDeDesconto.leitura();
        calculadoraDeDesconto.calculo();
    }
}
