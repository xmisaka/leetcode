## 283. Move Zeroes
  
### **链接**：  
题目：https://leetcode.com/problems/move-zeroes/  
  
代码(github)：https://github.com/xmisaka/LeetCode/  
  
### **题意**：  
将数组中的0放在数组的后边，其他数字放前边，保持数字的相对顺序不变。  
  
### **分析**：  
1. 变量标记0出现的次数count，然后一次循环，所有非零数字向前移动count位。循环结束，数组后面补零。
2. 注意：如果最后一位为零，则count不用+1，否则会多补一个零（数组越界）。


  

