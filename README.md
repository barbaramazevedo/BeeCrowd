# 🐝 BeeCrowd — Problem 1018: Banknotes

## 📌 Problem Description

In this problem, you must read an **integer value** and decompose it into the **smallest possible number of banknotes**.

The available banknotes are:

- R$ 100,00
- R$ 50,00
- R$ 20,00
- R$ 10,00
- R$ 5,00
- R$ 2,00
- R$ 1,00

The original value and the quantity of each banknote used must be printed exactly as shown in the example.

⚠️ Pay attention to the output format:
- Print the **original value** on the first line
- Print **one line for each banknote value**, in descending order
- Use the **Portuguese message exactly as specified**
- Print a **line break** after each line

---

## 📥 Input

The input file contains:
- **1 integer value** `N` `(0 < N < 1,000,000)`

---

## 📤 Output

Print:
- The input value
- The minimum quantity of each banknote required to compose the value

The output must follow **exactly** this format:

X  
A nota(s) de R$ 100,00  
B nota(s) de R$ 50,00  
C nota(s) de R$ 20,00  
D nota(s) de R$ 10,00  
E nota(s) de R$ 5,00  
F nota(s) de R$ 2,00  
G nota(s) de R$ 1,00

---

## 🧪 Examples

### Input
576

### Output
576  
5 nota(s) de R$ 100,00  
1 nota(s) de R$ 50,00  
1 nota(s) de R$ 20,00  
0 nota(s) de R$ 10,00  
1 nota(s) de R$ 5,00  
0 nota(s) de R$ 2,00  
1 nota(s) de R$ 1,00

---

### Input
11257

### Output
11257  
112 nota(s) de R$ 100,00  
1 nota(s) de R$ 50,00  
0 nota(s) de R$ 20,00  
0 nota(s) de R$ 10,00  
1 nota(s) de R$ 5,00  
1 nota(s) de R$ 2,00  
0 nota(s) de R$ 1,00

---

### Input
503

### Output
503  
5 nota(s) de R$ 100,00  
0 nota(s) de R$ 50,00  
0 nota(s) de R$ 20,00  
0 nota(s) de R$ 10,00  
0 nota(s) de R$ 5,00  
1 nota(s) de R$ 2,00  
1 nota(s) de R$ 1,00  