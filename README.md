# 🐝 BeeCrowd — Problem 1013: The Greatest

## 📌 Problem Description

Make a program that reads **three integer values** and determines the **greatest** among them.

After identifying the greatest value, print it followed by the message **"eh o maior"**.

To solve this problem, use the following formula to find the greatest value between two numbers:

\[
\text{maior}(a, b) = \frac{a + b + |a - b|}{2}
\]

You can apply this formula multiple times to compare the three values.

⚠️ Pay attention to the output format:
- Print the result on **a single line**
- Include **one space** between the number and the message
- Print a **line break** after the output

---

## 📥 Input

The input file contains:
- **3 integer values**, provided on the same line

---

## 📤 Output

Print the greatest of the three values followed by a space and the message:

eh o maior

---

## 🧪 Examples

### Input
7 14 106

### Output
106 eh o maior

---

### Input
217 14 6

### Output
217 eh o maior  