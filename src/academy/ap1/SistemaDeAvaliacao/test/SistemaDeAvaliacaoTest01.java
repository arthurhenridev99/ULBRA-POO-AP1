package academy.ap1.SistemaDeAvaliacao.test;

import academy.ap1.SistemaDeAvaliacao.domain.SistemaDeAvaliacao;

public class SistemaDeAvaliacaoTest01 {
    public static void main(String[] args) {
        SistemaDeAvaliacao sistemaDeAvaliacao = new SistemaDeAvaliacao();

        sistemaDeAvaliacao.recebendoValores();
        sistemaDeAvaliacao.calculoMedia();
    }
}
