package academy.ap1.CircuitoDeResistencias.domain;

public class CircuitoDeResistencias {
    private double resistencia1;
    private double resistencia2;
    private double resistencia3;
    private double resistencia4;
    private double equivalente;
    private double maior;
    private double menor;

    public CircuitoDeResistencias(double resistencia1, double resistencia2, double resistencia3, double resistencia4) {
        this.resistencia1 = resistencia1;
        this.resistencia2 = resistencia2;
        this.resistencia3 = resistencia3;
        this.resistencia4 = resistencia4;
    }

    public void resistenciaEquivalente() {
        equivalente = getResistencia1() + getResistencia2() + getResistencia3() + getResistencia4();
        System.out.println("A resistência equivalente é de: "+equivalente);
    }

    public void maiorResistencia() {
        maior = getResistencia1();
        if (getResistencia2() > maior) {
            maior = getResistencia2();
        } if (getResistencia3() > maior) {
            maior = getResistencia3();
        } if (getResistencia4() > maior) {
            maior = getResistencia4();
        }
        System.out.println("A maior resistência ligada em série é: "+maior);
    }

    public void menorResistencia() {
        menor = getResistencia1();
        if (getResistencia2() < menor) {
            menor = getResistencia2();
        } if (getResistencia3() < menor) {
            menor = getResistencia3();
        } if (getResistencia4() < menor) {
            menor = getResistencia4();
        }
        System.out.println("A menor resistência ligada em série é: "+menor);
    }

    public double getResistencia1() {
        return resistencia1;
    }

    public void setResistencia1(double resistencia1) {
        this.resistencia1 = resistencia1;
    }

    public double getResistencia2() {
        return resistencia2;
    }

    public void setResistencia2(double resistencia2) {
        this.resistencia2 = resistencia2;
    }

    public double getResistencia3() {
        return resistencia3;
    }

    public void setResistencia3(double resistencia3) {
        this.resistencia3 = resistencia3;
    }

    public double getResistencia4() {
        return resistencia4;
    }

    public void setResistencia4(double resistencia4) {
        this.resistencia4 = resistencia4;
    }
}
