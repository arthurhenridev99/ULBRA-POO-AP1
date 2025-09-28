package academy.ap1.CalculadoraDeAposentadoria.test;

import academy.ap1.CalculadoraDeAposentadoria.domain.CalculadoraDeAposentadoria;

public class CalculadoraDeAposentadoriaTest01 {
    public static void main(String[] args) {
        CalculadoraDeAposentadoria calculadoraDeAposentadoria = new CalculadoraDeAposentadoria();

        calculadoraDeAposentadoria.recebendoDados();
        calculadoraDeAposentadoria.calculoParaAposentar();
    }
}
