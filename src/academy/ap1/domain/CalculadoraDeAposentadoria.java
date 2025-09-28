package academy.ap1.domain;

import java.util.Scanner;

public class CalculadoraDeAposentadoria {
    private int idade;
    private String sexo;
    private int anosContribuicao;
    private String antesReforma;

    public void recebendoDados() {
        Scanner age = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        idade = age.nextInt();

        Scanner sex = new Scanner(System.in);
        System.out.println("Digite o seu sexo: (F) para feminino e (M) para masculino.");
        sexo = sex.nextLine();

        Scanner tempo = new Scanner(System.in);
        System.out.println("Digite o seu tempo de contribuição para o INSS: ");
        anosContribuicao = tempo.nextInt();

        if(sexo.equals("M")) {
            Scanner antes = new Scanner(System.in);
            System.out.println("Você contribuia antes da Reforma da Previdência (2019) ? Se sim (S), se não (N)");
            antesReforma = antes.nextLine();
        }
    }

    public void calculoParaAposentar() {
        int idadeNecessaria = 0;
        int contribuicaoNecessaria = 0;

        if (sexo.equalsIgnoreCase("F")) {
            idadeNecessaria = 62;
            contribuicaoNecessaria = 15;

            int pontos = idade + anosContribuicao;
            int pontosMinimos = 91;
            boolean podePelaRegraDePontos = (anosContribuicao >= 30 && pontos >= pontosMinimos);

            if (anosContribuicao >= contribuicaoNecessaria && idade >= idadeNecessaria) {
                System.out.println("Você já pode se aposentar por idade!");
            } else if (podePelaRegraDePontos) {
                System.out.println("Você já pode se aposentar pela regra de transição por pontos!");
            } else {
                int faltaIdade = Math.max(0, idadeNecessaria - idade);
                int faltaContrib = Math.max(0, contribuicaoNecessaria - anosContribuicao);
                System.out.println("Faltam " + faltaContrib + " anos de contribuição e " + faltaIdade + " anos de idade para se aposentar.");
            }

        } else if (sexo.equalsIgnoreCase("M")) {
            idadeNecessaria = 65;
            if (antesReforma != null && (antesReforma.equalsIgnoreCase("S") || antesReforma.equalsIgnoreCase("SIM"))) {
                contribuicaoNecessaria = 15;
            } else {
                contribuicaoNecessaria = 20;
            }

            int pontos = idade + anosContribuicao;
            int pontosMinimos = 101;
            boolean podePelaRegraDePontos = (anosContribuicao >= 35 && pontos >= pontosMinimos);

            if (anosContribuicao >= contribuicaoNecessaria && idade >= idadeNecessaria) {
                System.out.println("Você já pode se aposentar por idade!");
            } else if (podePelaRegraDePontos) {
                System.out.println("Você já pode se aposentar pela regra de transição por pontos!");
            } else {
                int faltaIdade = Math.max(0, idadeNecessaria - idade);
                int faltaContrib = Math.max(0, contribuicaoNecessaria - anosContribuicao);
                System.out.println("Faltam " + faltaContrib + " anos de contribuição e " + faltaIdade + " anos de idade para se aposentar.");
            }
        } else {
            System.out.println("Sexo inválido. Digite F ou M.");
        }
    }
}
