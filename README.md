Cleaning Robot Solution : The cleaning robot is tasked with traversing multiple rectangular areas and reporting its position at specific time intervals. The robot moves along the edges of the rectangles in a clockwise direction and transitions between rectangles when necessary. 
The challenge includes ensuring logical transitions between rectangles and returning the robot's position at queried times.
| Test Case | Input Rectangles                                              | Query Times             | Output Positions                                      | Status  |
| --------- | ------------------------------------------------------------- | ----------------------- | ----------------------------------------------------- | ------- |
| **1**     | (1,1)-(4,4), (5,5)-(7,7)                                      | 1, 2, 3, 4, 5           | [2,1], [3,1], [4,1], [4,2], [4,3]                     | Correct |
| **2**     | (100,100)-(200,200), (300,300)-(400,400)                      | 10, 20, 30, 40, 50      | [110,100], [120,100], [130,100], [140,100], [150,100] | Correct |
| **3**     | (1,1)-(10,10), (20,20)-(30,30), (40,40)-(50,50)               | 5, 15, 25, 35, 45       | [6,1], [10,7], [3,10], [1,2], [20,10]                 | Correct |
| **4**     | (1,1)-(5,5), (6,6)-(10,10), (11,11)-(15,15), (16,16)-(20,20)  | 1, 10, 20, 30, 40       | [2,1], [3,5], [8,6], [6,10], [15,11]                  | Correct |
| **5**     | (100,100)-(200,200), (150,150)-(250,250), (300,300)-(400,400) | 50, 100, 150, 200, 250  | [150,100], [200,100], [200,150], [200,200], [150,200] | Correct |
| **6**     | (1,1)-(1000,1000)                                             | 100, 200, 300, 400, 500 | [101,1], [201,1], [301,1], [401,1], [501,1]           | Correct |


