package academy.ap1.SistemaDeLogin.domain;

import java.util.Scanner;

public class SistemaDeLogin {
    private String cadastroUsuario;
    private String cadastroSenha;
    private String login;
    private String senha;

    private final Scanner scanner = new Scanner(System.in);

    public void cadastro() {
        System.out.println("Faça o seu cadastro, crie o seu login: (Nome de usuário)");
        cadastroUsuario = scanner.nextLine().trim();

        System.out.println("Faça o cadastro de sua senha para o login: ");
        cadastroSenha = scanner.nextLine().trim();
    }

    public void login() {
        System.out.println("Vamos realizar o seu login agora");

        System.out.println("Digite o seu login: (Nome de usuário)");
        login = scanner.nextLine().trim();

        System.out.println("Digite a sua senha para login: ");
        senha = scanner.nextLine().trim();
    }

    public void verificacao() {
        int tentativas = 3;

        while (tentativas > 0) {
            login();

            if (login.equals(cadastroUsuario) && senha.equals(cadastroSenha)) {
                System.out.println("Olá " + getLogin() + "! Acesso ao sistema de Login liberado.");
                break;
            } else {
                tentativas--;
                if (tentativas > 0) {
                    System.out.println("Login ou senha incorretos! Você ainda tem " + tentativas + " tentativa(s) restantes.");
                } else {
                    System.out.println("Acesso bloqueado! Número de tentativas esgotado.");
                }
            }
        }
    }

    public String getCadastroUsuario() {
        return cadastroUsuario;
    }

    public void setCadastroUsuario(String cadastroUsuario) {
        this.cadastroUsuario = cadastroUsuario;
    }

    public String getCadastroSenha() {
        return cadastroSenha;
    }

    public void setCadastroSenha(String cadastroSenha) {
        this.cadastroSenha = cadastroSenha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Scanner getScanner() {
        return scanner;
    }
}

