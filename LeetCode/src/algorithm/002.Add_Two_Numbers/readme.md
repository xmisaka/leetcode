## 001.Two_Sum (Medium)  
  
### **链接**：  
题目：https://leetcode.com/problems/add-two-numbers/  
代码(github)：https://github.com/xmisaka/LeetCode/  
  
### **题意**：  
给两个链表表示的非负数，然后用链表形式给出它们之和  
  
### **分析**：  
1. 第一次做的时候问题考虑的不透彻，没有抓住关键，if else 太多。虽然也AC了，但是比较混乱。 
2. 问题关键在于何时给res申请next节点，其实只有三种情况l1.next不为空；l2.next不为空；有进位；

  

