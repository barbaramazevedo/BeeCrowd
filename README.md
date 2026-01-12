# 🐝 BeeCrowd — Problem 1009: Salary with Bonus

## 📌 Problem Description

Make a program that reads:

- A seller's **name**
- The seller's **fixed salary**
- The **total amount sold** by the seller in the month

Considering that the seller receives a **15% commission** over the total sales, calculate and print the seller’s **final salary** at the end of the month, formatted with **two decimal places**.

⚠️ Pay attention to the output format:

- Print a **line break** after the result
- Include **blank spaces exactly as shown**
- Include a **space before and after** the equal sign (`=`)
- Include a **space after `R$`**

---

## 📥 Input

The input file contains:

- **1 text value** (seller's first name)
- **2 double precision values**:
  - Fixed salary
  - Total value sold in the month

Each value is provided on a separate line.

---

## 📤 Output

Print the seller’s **total salary** (fixed salary + 15% commission) in the format:

TOTAL = R$ X

Where the salary must be displayed with **two decimal places**.

---

## 🧪 Examples

### Input

JOAO  
500.00  
1230.30

### Output

TOTAL = R$ 684.54

---

### Input

PEDRO  
700.00  
0.00

### Output

TOTAL = R$ 700.00

---

### Input

MANGOJATA  
1700.00  
1230.50

### Output

TOTAL = R$ 1884.58
