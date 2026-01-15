# 🐝 BeeCrowd — Problem 1023: Drought

## 📌 Problem Description

Due to a long period of drought, a government agency is analyzing **water consumption data** from several cities.  
For each city, the agency evaluates:

- The **water consumption behavior** of its inhabitants
- The **average consumption per person**

Each city is composed of several **properties**, and for each property you are given:
- The **number of residents**
- The **total water consumption** of that property (in cubic meters)

Your task is to process this data and present the results following the required format.

---

## 📥 Input

The input contains **multiple test cases**.

For each test case:
- The first line contains an integer **N** `(1 ≤ N ≤ 10⁶)`, representing the number of properties
- The next **N lines** contain two integers:
  - `X` — number of residents `(1 ≤ X ≤ 10)`
  - `Y` — total consumption of the property in m³ `(1 ≤ Y ≤ 200)`

The end of input is indicated by a line containing **0**.

---

## 📤 Output

For each test case, print:

1. A header line in the format:


Cidade# n:

Where **n** is the city number (starting from 1)

2. A line listing the data in **ascending order of consumption per person**, where each entry follows the format:


residents-consumption

- The consumption value must be **rounded down** (integer division)
- Entries must be separated by a **space**

3. A line showing the **average consumption per person** in the city:


Consumo medio: X.XX m3.

- Display **two decimal places**
- **Do not round** the value

⚠️ Formatting rules:
- Print a **blank line between test cases**
- Do **not** print a blank line after the last test case
- Follow the **Portuguese messages exactly**

---

## 🧮 Notes

- The average consumption per person is calculated using the **total real consumption** divided by the **total number of residents**
- Sorting is done based on the **integer consumption per person** (rounded down)

---

## 🧪 Examples

### Input


3
3 22
2 11
3 39
5
1 25
2 20
3 31
2 40
6 70
2
1 1
3 2
0


### Output


Cidade# 1:
2-5 3-7 3-13
Consumo medio: 9.00 m3.

Cidade# 2:
5-10 6-11 2-20 1-25
Consumo medio: 13.28 m3.

Cidade# 3:
3-0 1-1
Consumo medio: 0.75 m3.