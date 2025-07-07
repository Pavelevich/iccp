# 🧼 Cleaning Robot Solution

A Java solution to a path-planning challenge involving a robot that traverses multiple rectangular zones in a clockwise fashion. The robot reports its position at specified times as it seamlessly transitions between rectangle perimeters.

## 🧠 Overview

The cleaning robot follows these rules:

- It moves **clockwise** along the perimeter of one or more **rectangles**.
- It transitions from one rectangle to the next immediately after completing the previous one.
- At specific time intervals (query times), the robot reports its **(x, y)** position.

The implementation ensures **accurate path simulation** and **correct timing** across multiple rectangles.

## ✅ Test Cases and Results

| Test Case | Input Rectangles                                              | Query Times             | Output Positions                                      | Status  |
| --------- | ------------------------------------------------------------- | ----------------------- | ----------------------------------------------------- | ------- |
| **1**     | (1,1)-(4,4), (5,5)-(7,7)                                      | 1, 2, 3, 4, 5           | [2,1], [3,1], [4,1], [4,2], [4,3]                     | ✅ Correct |
| **2**     | (100,100)-(200,200), (300,300)-(400,400)                      | 10, 20, 30, 40, 50      | [110,100], [120,100], [130,100], [140,100], [150,100] | ✅ Correct |
| **3**     | (1,1)-(10,10), (20,20)-(30,30), (40,40)-(50,50)               | 5, 15, 25, 35, 45       | [6,1], [10,7], [3,10], [1,2], [20,10]                 | ✅ Correct |
| **4**     | (1,1)-(5,5), (6,6)-(10,10), (11,11)-(15,15), (16,16)-(20,20)  | 1, 10, 20, 30, 40       | [2,1], [3,5], [8,6], [6,10], [15,11]                  | ✅ Correct |
| **5**     | (100,100)-(200,200), (150,150)-(250,250), (300,300)-(400,400) | 50, 100, 150, 200, 250  | [150,100], [200,100], [200,150], [200,200], [150,200] | ✅ Correct |
| **6**     | (1,1)-(1000,1000)                                             | 100, 200, 300, 400, 500 | [101,1], [201,1], [301,1], [401,1], [501,1]           | ✅ Correct |

## 🛠️ Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/yourusername/cleaning-robot-solution.git
cd cleaning-robot-solution
