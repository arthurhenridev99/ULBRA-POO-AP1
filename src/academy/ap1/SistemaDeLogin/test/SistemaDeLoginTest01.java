package academy.ap1.SistemaDeLogin.test;

import academy.ap1.SistemaDeLogin.domain.SistemaDeLogin;

public class SistemaDeLoginTest01 {
    public static void main(String[] args) {
        SistemaDeLogin sistemaDeLogin = new SistemaDeLogin();

        sistemaDeLogin.cadastro();
        sistemaDeLogin.verificacao();
    }
}
