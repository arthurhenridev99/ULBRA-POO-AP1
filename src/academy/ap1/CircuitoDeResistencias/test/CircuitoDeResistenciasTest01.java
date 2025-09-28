package academy.ap1.CircuitoDeResistencias.test;

import academy.ap1.CircuitoDeResistencias.domain.CircuitoDeResistencias;

public class CircuitoDeResistenciasTest01 {
    public static void main(String[] args) {
        CircuitoDeResistencias circuitoDeResistencias = new CircuitoDeResistencias(80,20,100,50);

        circuitoDeResistencias.resistenciaEquivalente();
        circuitoDeResistencias.maiorResistencia();
        circuitoDeResistencias.menorResistencia();
    }
}
