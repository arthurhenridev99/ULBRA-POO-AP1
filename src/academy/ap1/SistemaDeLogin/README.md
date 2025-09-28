# 🔐 Sistema de Login

## 📌 Enunciado

Crie uma classe que simule o acesso a um sistema solicitando **login** e **senha**.
O usuário tem **três tentativas** para acertar, recebendo mensagens de erro a cada falha.
Caso os dados coincidam com o cadastro, o acesso é liberado.

---

## ⚙️ Lógica da Solução

1. O usuário faz um **cadastro inicial** com login e senha.
2. O sistema inicia o processo de **login**:

   * Solicita usuário e senha.
   * Compara os dados inseridos com os cadastrados.
3. O usuário tem **até 3 tentativas**:

   * Se acertar, recebe mensagem de boas-vindas.
   * Se errar, é informado do número de tentativas restantes.
   * Após 3 erros, o acesso é bloqueado.

---

## ▶️ Exemplo de Execução

```
Faça o seu cadastro, crie o seu login: (Nome de usuário)
> java8
Faça o cadastro de sua senha para o login:
> java8

Vamos realizar o seu login agora
Digite o seu login: (Nome de usuário)
> Arthur
Digite a sua senha para login:
> teste

Login ou senha incorretos! Você ainda tem 2 tentativa(s) restantes.
...
Olá java8! Acesso ao sistema de Login liberado.
```

---

## 🚀 Conceitos Praticados

* Estruturas de repetição (`while`);
* Condições (`if/else`);
* Controle de tentativas;
* Entrada de dados com **Scanner**;
* Encapsulamento com **getters e setters**.
