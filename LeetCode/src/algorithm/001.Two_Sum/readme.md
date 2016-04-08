## 001.Two_Sum (Medium)  
  
### **链接**：  
题目：https://leetcode.com/problems/two-sum/  
代码(github)：https://github.com/xmisaka/LeetCode/  
  
### **题意**：  
一个数组中两个位置上的数的和恰为 target，求这两个位置。  
  
### **分析**：  
1. 作为第一道题，直观的想法就是暴力破解，双重for循环，测试通过，没有超时。 
2. 先排序，再查找。
3. 使用map，将已经出现的数存放到map中，然后每新出一个数n，就从map中查看是否存在target - n,如果不存在就讲n也放入map中

  

