package academy.ap1.CalculadoraDeITBI.domain;

import javax.swing.JOptionPane;

public class CalculadoraDeITBI {
    double valorTransacaoImovel;
    double valorVenal;
    double aliquota;

    public void transacao() {
        String valorDigitado = JOptionPane.showInputDialog("Digite o valor da transação do imóvel: ");
        valorTransacaoImovel = Double.parseDouble(valorDigitado);
    }

    public void venal() {
        String valorV = JOptionPane.showInputDialog("Digite o valor venal do imóvel: ");
        valorVenal = Double.parseDouble(valorV);
    }

    public void porcentagem() {
        String porcentagemImposto = JOptionPane.showInputDialog("Digite a % do imposto ITBI: ");
        aliquota = Double.parseDouble(porcentagemImposto);
        aliquota = aliquota / 100;
    }

    public void calculoImposto() {
        if(valorTransacaoImovel > valorVenal) {
            valorTransacaoImovel = (valorTransacaoImovel * aliquota);
            System.out.println("O valor do imposto ITBI nesse imóvel foi de: "+valorTransacaoImovel+" reais! Calculado no Valor de Transação do Imóvel (Maior Valor).");
        } else {
            valorVenal = (valorVenal * aliquota);
            System.out.println("O valor do imposto ITBI nesse imóvel foi de: "+valorVenal+" reais! Calculado no Valor Venal do Imóvel (Maior Valor).");
        }
    }
}
