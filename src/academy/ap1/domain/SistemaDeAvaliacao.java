package academy.ap1.domain;

import javax.swing.JOptionPane;

public class SistemaDeAvaliacao {
    private double prova1;
    private double prova2;
    private double trabalhoAvaliativo;
    private double somaNotas;

    public void recebendoValores() {
        String nota1 = JOptionPane.showInputDialog("Digite a nota da primeira prova:  'Valor máximo: 10'");
        prova1 = Double.parseDouble(nota1);
        String nota2 = JOptionPane.showInputDialog("Digite a nota da segunda prova: 'Valor máximo: 10'");
        prova2 = Double.parseDouble(nota2);
        String notaTrabalho = JOptionPane.showInputDialog("Digita a nota do trabalho avaliativo: 'Valor máximo: 10'");
        trabalhoAvaliativo = Double.parseDouble(notaTrabalho);
        }
    public void calculoMedia() {
        somaNotas = (getProva1() + getProva2() + getTrabalhoAvaliativo()) / 3;
        if(somaNotas >= 6) {
            System.out.println("O aluno está aprovado com um aproveitamento de "+getSomaNotas()+" de média.");
        } else {
            System.out.println("O aluno está reprovado com um aproveitamento de "+getSomaNotas()+" de média");
        }
    }

    public double getProva1() {
        return prova1;
    }

    public void setProva1(double prova1) {
        this.prova1 = prova1;
    }

    public double getProva2() {
        return prova2;
    }

    public void setProva2(double prova2) {
        this.prova2 = prova2;
    }

    public double getTrabalhoAvaliativo() {
        return trabalhoAvaliativo;
    }

    public void setTrabalhoAvaliativo(double trabalhoAvaliativo) {
        this.trabalhoAvaliativo = trabalhoAvaliativo;
    }

    public double getSomaNotas() {
        return somaNotas;
    }

    public void setSomaNotas(double somaNotas) {
        this.somaNotas = somaNotas;
    }
}
