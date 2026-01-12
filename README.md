# 🐝 BeeCrowd — Problem 1010: Simple Calculate

## 📌 Problem Description

In this problem, you must read the information of **two products**, where each product has:

- A **product code**
- The **number of units**
- The **price per unit**

After reading the data, calculate and print the **total amount to be paid**, formatted with **two decimal places**.

⚠️ Pay attention to the output format:

- Print a **line break** after the result
- Include **blank spaces exactly as shown**
- Include a **space after `:`**
- Include a **space after `R$`**
- The value must be displayed with **two digits after the decimal point**

---

## 📥 Input

The input file contains **two lines**.

Each line contains:

- **2 integer values** (product code and number of units)
- **1 floating-point value** (price per unit, with two decimal places)

---

## 📤 Output

Print a message in the following format:

VALOR A PAGAR: R$ X

Where **X** is the total amount to be paid, displayed with **two decimal places**.

---

## 🧪 Examples

### Input

12 1 5.30  
16 2 5.10

### Output

VALOR A PAGAR: R$ 15.50

---

### Input

13 2 15.30  
161 4 5.20

### Output

VALOR A PAGAR: R$ 51.40

---

### Input

1 1 15.10  
2 1 15.10

### Output

VALOR A PAGAR: R$ 30.20
