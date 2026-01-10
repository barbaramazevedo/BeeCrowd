# 🐝 BeeCrowd — Problem 1005: Average 1

## 📌 Problem Description

Read two floating-point values (**double precision**) **A** and **B**, corresponding to two student grades.  
Calculate the student's average, considering the following weights:

- Grade **A** has weight **3.5**
- Grade **B** has weight **7.5**

Each grade ranges from **0.0 to 10.0**, always with **one digit after the decimal point**.

⚠️ **Attention:**  
Do not forget to print a line break after the output; otherwise, a **Presentation Error** may occur.  
Also, remember to include a blank space before and after the equal sign.

---

## 📥 Input

The input file contains **two floating-point values**, each with **one digit after the decimal point**.

---

## 📤 Output

Print the message **`MEDIA =`** (average in Portuguese), followed by the student's average, formatted with **five digits after the decimal point**, according to the format below:

MEDIA = value

yaml
Copiar código

---

## 🧪 Examples

### Input
5.0
7.1

shell
Copiar código

### Output
MEDIA = 6.43182

yaml
Copiar código

---

### Input
0.0
7.1

shell
Copiar código

### Output
MEDIA = 4.84091

yaml
Copiar código

---

### Input
10.0
10.0

shell
Copiar código

### Output
MEDIA = 10.00000