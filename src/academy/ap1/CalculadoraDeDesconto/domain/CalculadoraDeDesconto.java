package academy.ap1.CalculadoraDeDesconto.domain;

import java.util.Scanner;

public class CalculadoraDeDesconto {
    private String produto;
    private double valor;
    private double desconto;
    private double precoFinal;

    public void leitura() {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Nome do Produto: ");
        this.produto = sc1.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Valor do Produto: ");
        this.valor = sc2.nextDouble();
    }

    public void calculo() {
        if(valor <= 500.0) {
            desconto = 10;
            precoFinal = (valor * desconto) / 100;
            valor = valor - precoFinal;
            System.out.println("O produto: "+produto+" recebeu 10% de desconto e custou: "+valor+" reais! Com um total de: "+precoFinal+" de desconto!");
        } else if (valor <= 1000.0) {
            desconto = 15;
            precoFinal = (valor * desconto) / 100;
            valor = valor - precoFinal;
            System.out.println("O produto: "+produto+" recebeu 15% de desconto e custou: "+valor+" reais! Com um total de: "+precoFinal+" de desconto!");
        } else if (valor >= 2000.0) {
            desconto = 20;
            precoFinal = (valor * desconto) / 100;
            valor = valor - precoFinal;
            System.out.println("O produto: "+produto+" recebeu 20% de desconto e custou: "+valor+" reais! Com um total de: "+precoFinal+" de desconto!");
        }
        else {
            System.out.println("Este produto não tem desconto!");
        }
    }
    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public void setPrecoFinal(double precoFinal) {
        this.precoFinal = precoFinal;
    }
}
