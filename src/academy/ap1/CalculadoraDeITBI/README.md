# 🏠 Calculadora de ITBI

## 📌 Enunciado

Crie uma classe que utilize a `JOptionPane` para entrada de dados.
Receba o valor de transação de um imóvel, o valor venal e a porcentagem do imposto ITBI.
Calcule o imposto com base no **maior valor** entre o valor de transação e o valor venal.

---

## ⚙️ Lógica da Solução

1. O usuário informa, via `JOptionPane`:

   * O valor da transação do imóvel;
   * O valor venal do imóvel;
   * A porcentagem do imposto ITBI.
2. O programa converte a porcentagem em valor decimal (ex.: 3% → 0.03).
3. O cálculo é feito sobre o **maior valor** entre:

   * Valor da transação;
   * Valor venal.
4. Exibe o valor do imposto ITBI calculado.

---

## ▶️ Exemplo de Execução

```
Digite o valor da transação do imóvel: 250000
Digite o valor venal do imóvel: 200000
Digite a % do imposto ITBI: 3
O valor do imposto ITBI nesse imóvel foi de: 7500.0 reais! Calculado no Valor de Transação do Imóvel (Maior Valor).
```

---

## 🚀 Conceitos Praticados

* Entrada de dados com `JOptionPane`;
* Conversão de valores `String` → `double`;
* Estruturas condicionais (`if / else`);
* Cálculo percentual aplicado ao maior valor entre duas opções.
