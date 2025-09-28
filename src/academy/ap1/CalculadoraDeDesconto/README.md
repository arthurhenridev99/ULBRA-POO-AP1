# 🧮 Calculadora de Desconto

## 📌 Enunciado

Desenvolver uma classe que utilize a classe `Scanner` para receber o valor de um produto e aplicar descontos de acordo com faixas de preço. O programa deve calcular o valor do desconto e exibir o preço final do produto.

---

## ⚙️ Lógica da Solução

1. O usuário informa:

   * Nome do produto;
   * Valor do produto.
2. O sistema verifica o valor e aplica as seguintes regras:

   * Até **500,00** → **10% de desconto**;
   * Até **1000,00** → **15% de desconto**;
   * A partir de **2000,00** → **20% de desconto**;
   * Caso não se enquadre nas faixas acima → **sem desconto**.
3. O programa calcula:

   * Valor do desconto;
   * Preço final após desconto.
4. Por fim, exibe uma mensagem informando o produto, a porcentagem aplicada e os valores calculados.

---

## ▶️ Exemplo de Execução

```
Nome do Produto: Notebook
Valor do Produto: 2500
O produto: Notebook recebeu 20% de desconto e custou: 2000.0 reais! Com um total de: 500.0 de desconto!
```

---

## 🚀 Conceitos Praticados

* Entrada de dados com `Scanner`;
* Estruturas condicionais (`if / else if / else`);
* Operações matemáticas para cálculo percentual;
* Encapsulamento de atributos em uma classe.
