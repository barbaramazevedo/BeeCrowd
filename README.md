# 🐝 BeeCrowd — Problem 1015: Distance Between Two Points

## 📌 Problem Description

Read the coordinates of **two points in a Cartesian plane**,  
**p1 (x1, y1)** and **p2 (x2, y2)**, and calculate the **distance between them**.

The distance must be calculated using the following formula:

\[
\text{Distance} = \sqrt{(x_2 - x_1)^2 + (y_2 - y_1)^2}
\]

⚠️ Pay attention to the output format:
- The result must be displayed with **four decimal places**
- Print a **line break** after the result
- Do **not** print any additional text

---

## 📥 Input

The input file contains **two lines**:
- The first line contains two **double values**: `x1 y1`
- The second line contains two **double values**: `x2 y2`

Each value has **one digit after the decimal point**.

---

## 📤 Output

Print the distance between the two points, calculated using the given formula, with **four decimal places**.

---

## 🧪 Examples

### Input
1.0 7.0  
5.0 9.0

### Output
4.4721

---

### Input
-2.5 0.4  
12.1 7.3

### Output
16.1484

---

### Input
2.5 -0.4  
-12.2 7.0

### Output
16.4575  