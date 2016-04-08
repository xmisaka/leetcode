## 003.longest-substring-without-repeating-characters (Medium)  
  
### **链接**：  
题目：https://leetcode.com/problems/longest-substring-without-repeating-characters/  
代码(github)：https://github.com/xmisaka/LeetCode/  
  
### **题意**：  
求一个字符串最长无重复的子序列  
  
### **分析**：  
1.  * 直观的想到用HashMap存储已经遍历的字符，并且维护一个左边界left,left右侧为我们的有效map；
    * 读入一个新字符，如果map中有该字符并且位于left右侧，说明读入了重复字符，更新left 
    * 如果长度大于res,更新res
2. 由于本题是要为单个字符建立map，所以可以直接用数组实现，每个字符的ASC码代表桶的编号，大大减少了维护hashmap的开销。

  

