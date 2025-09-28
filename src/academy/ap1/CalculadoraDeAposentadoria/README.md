# 👵👴 Calculadora de Aposentadoria

## 📌 Enunciado

Elabore uma classe que receba **idade**, **sexo** e **anos de contribuição** de uma pessoa.
Determine se ela já pode se aposentar ou quantos anos faltam, considerando as regras da **Reforma da Previdência** (2019), por **idade mínima** ou por **tempo de contribuição/pontos**.

---

## ⚙️ Lógica da Solução

1. O usuário informa:

   * Idade;
   * Sexo (M ou F);
   * Anos de contribuição;
   * Para homens: se já contribuía **antes da Reforma da Previdência**.
2. O sistema define os requisitos mínimos:

   * **Mulheres** → 62 anos de idade + 15 anos de contribuição (ou regra de pontos: 30 anos contribuição + 91 pontos).
   * **Homens** → 65 anos de idade + 20 anos de contribuição (15 se antes da Reforma)
     (ou regra de pontos: 35 anos contribuição + 101 pontos).
3. O programa compara os dados informados com as regras:

   * Se já atende aos critérios, exibe que pode se aposentar;
   * Caso contrário, mostra **quantos anos ainda faltam** de idade e/ou contribuição.

---

## ▶️ Exemplo de Execução

```
Digite a sua idade: 60
Digite o seu sexo: (F) para feminino e (M) para masculino.
F
Digite o seu tempo de contribuição para o INSS: 20
Você já pode se aposentar por idade!
```

---

## 🚀 Conceitos Praticados

* Entrada de dados com `Scanner`;
* Condicionais aninhadas (`if / else if / else`);
* Regras de negócio com cálculos de idade + contribuição (pontos);
* Encapsulamento em classe;
* Validação de regras diferentes para homens e mulheres.
