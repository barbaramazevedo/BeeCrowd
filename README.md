# 🐝 BeeCrowd — Problem 1021: Banknotes and Coins

## 📌 Problem Description

Read a **floating-point value** representing a monetary amount and decompose it into the **smallest possible number of banknotes and coins**.

The available denominations are:

### Banknotes
- R$ 100.00
- R$ 50.00
- R$ 20.00
- R$ 10.00
- R$ 5.00
- R$ 2.00

### Coins
- R$ 1.00
- R$ 0.50
- R$ 0.25
- R$ 0.10
- R$ 0.05
- R$ 0.01

⚠️ Pay attention to the output format:
- Print the title **`NOTAS:`** before listing the banknotes
- Print the title **`MOEDAS:`** before listing the coins
- Print the values in the **exact order** shown
- Print a **line break** after each line
- Follow the **Portuguese format exactly** as in the examples

---

## 📥 Input

The input file contains:
- **1 floating-point value** `N` `(0 ≤ N ≤ 1,000,000.00)`
- The value has **two decimal places**

---

## 📤 Output

Print:
- The minimum quantity of each **banknote**
- Followed by the minimum quantity of each **coin**

The output must follow **exactly** this structure:

NOTAS:  
A nota(s) de R$ 100.00  
B nota(s) de R$ 50.00  
C nota(s) de R$ 20.00  
D nota(s) de R$ 10.00  
E nota(s) de R$ 5.00  
F nota(s) de R$ 2.00  
MOEDAS:  
G moeda(s) de R$ 1.00  
H moeda(s) de R$ 0.50  
I moeda(s) de R$ 0.25  
J moeda(s) de R$ 0.10  
K moeda(s) de R$ 0.05  
L moeda(s) de R$ 0.01

---

## 🧪 Examples

### Input
576.73

### Output
NOTAS:  
5 nota(s) de R$ 100.00  
1 nota(s) de R$ 50.00  
1 nota(s) de R$ 20.00  
0 nota(s) de R$ 10.00  
1 nota(s) de R$ 5.00  
0 nota(s) de R$ 2.00  
MOEDAS:  
1 moeda(s) de R$ 1.00  
1 moeda(s) de R$ 0.50  
0 moeda(s) de R$ 0.25  
2 moeda(s) de R$ 0.10  
0 moeda(s) de R$ 0.05  
3 moeda(s) de R$ 0.01

---

### Input
4.00

### Output
NOTAS:  
0 nota(s) de R$ 100.00  
0 nota(s) de R$ 50.00  
0 nota(s) de R$ 20.00  
0 nota(s) de R$ 10.00  
0 nota(s) de R$ 5.00  
2 nota(s) de R$ 2.00  
MOEDAS:  
0 moeda(s) de R$ 1.00  
0 moeda(s) de R$ 0.50  
0 moeda(s) de R$ 0.25  
0 moeda(s) de R$ 0.10  
0 moeda(s) de R$ 0.05  
0 moeda(s) de R$ 0.01

---

### Input
91.01

### Output
NOTAS:  
0 nota(s) de R$ 100.00  
1 nota(s) de R$ 50.00  
2 nota(s) de R$ 20.00  
0 nota(s) de R$ 10.00  
0 nota(s) de R$ 5.00  
0 nota(s) de R$ 2.00  
MOEDAS:  
1 moeda(s) de R$ 1.00  
0 moeda(s) de R$ 0.50  
0 moeda(s) de R$ 0.25  
0 moeda(s) de R$ 0.10  
0 moeda(s) de R$ 0.05  
1 moeda(s) de R$ 0.01  