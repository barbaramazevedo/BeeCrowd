# 🐝 BeeCrowd — Problem 1022: TDA Rational

## 📌 Problem Description

You are asked to read and evaluate **mathematical expressions involving rational numbers** (fractions).  
Each expression contains **two rational values** and **one arithmetic operation**, all separated by blank spaces.

Each rational number is given in the format:

numerator / denominator


After performing the operation, you must print:
1. The **resulting fraction (not simplified)**
2. The **simplified fraction**, separated by the `=` symbol

If the fraction **cannot be simplified**, print the same value on both sides of `=`.

---

## ➕➖✖️➗ Operations

Considering:
- `N1/D1` as the first fraction
- `N2/D2` as the second fraction

Use the following rules:

- **Sum (`+`)**  
  \[
  (N1 \times D2 + N2 \times D1) / (D1 \times D2)
  \]

- **Subtraction (`-`)**  
  \[
  (N1 \times D2 - N2 \times D1) / (D1 \times D2)
  \]

- **Multiplication (`*`)**  
  \[
  (N1 \times N2) / (D1 \times D2)
  \]

- **Division (`/`)**  
  \[
  (N1 \times D2) / (N2 \times D1)
  \]

⚠️ Pay attention to the output format:
- Always print the **unsimplified result first**
- Then print ` = ` followed by the **simplified fraction**
- Print a **line break** after each result

---

## 📥 Input

The input starts with:
- **1 integer `N`** `(1 ≤ N ≤ 10⁴)` — number of test cases

Each of the next `N` lines contains:
- A rational value `X`
- An operation (`+`, `-`, `*`, `/`)
- Another rational value `Y`

All elements are separated by **spaces**, following this format:

N1 / D1 op N2 / D2

---

## 📤 Output

For each test case, print:

A/B = C/D


Where:
- `A/B` is the **resulting fraction (not simplified)**
- `C/D` is the **simplified fraction**

---

## 🧪 Examples

### Input
4
1 / 2 + 3 / 4
1 / 2 - 3 / 4
2 / 3 * 6 / 6
1 / 2 / 3 / 4


### Output
10/8 = 5/4
-2/8 = -1/4
12/18 = 2/3
4/6 = 2/3