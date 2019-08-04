# LeetCode Problems

## 1. Two Sum 

Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.

simplest solution is create a hashmap add each difference and related index when we iterate throught the array check the diff if it contains just add it into the array.

```java
 public static int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    int[] result = new int[2];
    int i = 0;
    while(i< nums.length){
        int diff = target - nums[i];

        if(hashMap.containsKey(nums[i])){
            result[0] = hashMap.get(nums[i]);
            result[1] = i; 
        }
        hashMap.put(diff, i);
        i++;
    }
    return result;
}
```

## 7. Reverse Integer
   
Given a 32-bit signed integer, reverse digits of an integer.

```java
   public static int reverse(int x) {
        int temp = x; 
        if(x < 0) temp *= -1;
        long reverseNum = 0;
        while(temp != 0){
            reverseNum = (reverseNum * 10) + (temp%10);
            temp /= 10;
        }
        if(x < 0) reverseNum *= -1;
        
        return reverseNum < Integer.MIN_VALUE || reverseNum > Integer.MAX_VALUE ? 0 : (int) reverseNum;
    }
```


## 9. Palindrome Number

Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

```java
public static boolean isPalindrome(int x) {
    int temp = x; 
    if(x < 0) temp *= -1;
    long reverseNum = 0;
    while(temp != 0){
        reverseNum = (reverseNum * 10) + (temp%10);
        temp /= 10;
    }

    return x == reverseNum;
}
```

## 13.  Roman to Integer

Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.

Example 1:

Input: "III"
Output: 3
Example 2:

Input: "IV"
Output: 4
Example 3:

Input: "IX"
Output: 9
Example 4:

Input: "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 5:

Input: "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

the previous degit should always be greater and equal to the current one 
if this is not a case we have to subtract the current from the sum.

```java
public static int romanToInt(String s) {
    HashMap <Character, Integer> Roman = new HashMap<Character, Integer>(){{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};
    
    int sum = 0;
    int i = s.length()-1;
    int previous = 0;

    while(i>=0){
        int actual = Roman.get(s.charAt(i));
        if (previous <= actual)  sum += actual;
        else sum -= actual;
        i--;
        previous = actual;
    }

    return sum;
}
```


## 14. Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


first find out smallest word in the array

then itrate throught the array find the simillare char in each words

```java
 public static String longestCommonPrefix(String[] strs) {
    
    StringBuffer result = new StringBuffer("");

    if (strs == null || strs.length == 0) return result.toString();

    int smallestWord = 0;
    
    for(int i = 1; i< strs.length; i++){
        if(strs[smallestWord].length() > strs[i].length()) smallestWord = i;
    }

    int i = 0;
    while( i< strs[smallestWord].length()){
        int j = 0;
        while(j< strs.length){
            
            if(strs[smallestWord].charAt(i) != strs[j].charAt(i)) return result.toString();
            
            j++;
        }
        result.append(strs[smallestWord].charAt(i));
        i++;
    }
    return result.toString();
    
}
```

## 20. Valid Parentheses

Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:

Input: "()"
Output: true
Example 2:

Input: "()[]{}"
Output: true
Example 3:

Input: "(]"
Output: false
Example 4:

Input: "([)]"
Output: false
Example 5:

Input: "{[]}"
Output: true

use the stack to push and pop the sequence 
if its opaning then push to the stack else pop from the stack 

```java
public static boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    LinkedList<Character> list = new LinkedList<>();
    int i = 0;
    if (s == null || s.length() == 0) return true;

    while (i < s.length()) {
        char pare = s.charAt(i);

        if (pare == '(' || pare == '{' || pare == '[') stack.push(pare);

        else {
            if (!stack.isEmpty()) {
                if ((char) stack.peek() == '(' && pare == ')') stack.pop();
                else if ((char) stack.peek() == '[' && pare == ']') stack.pop();
                else if ((char) stack.peek() == '{' && pare == '}') stack.pop();
                else  list.add(pare);
            } else list.add(pare);
        }

        i++;
    }

    return stack.isEmpty() && list.isEmpty();
}
```

## 21. Merge Two Sorted Lists

Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4

```java
 public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(0);;
    ListNode p = l1, q =l2, curr = dummy;
    
    if(p == null && q == null) {
        return null;
    }
    if(p == null) {
        return q;
    }
    if(q == null) {
        return p;
    }
    while(p != null && q != null){
        if(p.val < q.val) {
            curr.next = p;
            p = p.next;
        } else {     
            curr.next = q;
            q = q.next;
        } 
            curr = curr.next;
    }
    
    
    if(p != null) {
        curr.next = p;      
    }
    
    if(q != null) {
        curr.next = q;      
    }
    return dummy.next;
}
```

## 26. Remove Duplicates from Sorted Array

Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Given nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.

It doesn't matter what you leave beyond the returned length.
Example 2:

Given nums = [0,0,1,1,1,2,2,3,3,4],

Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.

It doesn't matter what values are set beyond the returned length.
Clarification:

Confused why the returned value is an integer but your answer is an array?

Note that the input array is passed in by reference, which means modification to the input array will be known to the caller as well.

Internally you can think of this:

// nums is passed in by reference. (i.e., without making a copy)
int len = removeDuplicates(nums);

// any modification to nums in your function would be known by the caller.
// using the length returned by your function, it prints the first len elements.
for (int i = 0; i < len; i++) {
    print(nums[i]);
}


```java
 public static int removeDuplicates(int[] nums) {
        int count = 1;
        int curr=0, pre=0;
        if (nums.length == 0) return 0;
        while (curr < nums.length) {

            if(nums[curr] != nums[pre]){
                pre++;
                nums[pre] = nums[curr];
                count++;
            }
            curr++;
        }
        System.out.println(Arrays.toString(nums));
        return count;
    }
```


## 27. Remove Element

Given an array nums and a value val, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example 1:

Given nums = [3,2,2,3], val = 3,

Your function should return length = 2, with the first two elements of nums being 2.

It doesn't matter what you leave beyond the returned length.
Example 2:

Given nums = [0,1,2,2,3,0,4,2], val = 2,

Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4.

Note that the order of those five elements can be arbitrary.

It doesn't matter what values are set beyond the returned length.


```java
public static int removeElement(int[] nums, int val) {
    int count = 0;
    int pos = 0, curr = 0;
    while(pos < nums.length){

        if(nums[curr] == val & nums[pos] != val){
            int temp = nums[curr];
            nums[curr] = nums[pos];
            nums[pos] = temp;
            count++;
            curr++;
        } 
        if(nums[pos]!= val){
        count++;
        curr++;
        }
                    
        pos++;
        
    }
    System.out.println(Arrays.toString(nums));

    return count;

    
}
```

```java
// More Simpler version of my solution  
int  j =0;
for(int i: nums){
    if(i != val){
        nums[j] = i;
        j++;
    }
}
return j;
```

## 28. Implement strStr()

Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1
Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().

```java
public static int strStr(String haystack, String needle) {

    int needleLen = needle.length(), haystackLen = haystack.length();

    if (needleLen == 0) return 0;

    int index = -1;
    int i = 0;

    if(haystackLen == needleLen) {
        if(haystack.equals(needle)) return 0;
        
        return -1;
    }

    while (i< (haystackLen - needleLen)+1 ){
        if (haystack.substring(i, i+needleLen).equals(needle)) {
            return i;
        }

        i++;
    }


    return -1;
}
```

## 35. Search Insert Position

Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Example 1:

Input: [1,3,5,6], 5
Output: 2
Example 2:

Input: [1,3,5,6], 2
Output: 1
Example 3:

Input: [1,3,5,6], 7
Output: 4
Example 4:

Input: [1,3,5,6], 0
Output: 0

```java
public static int searchInsert(int[] nums, int target) {
    
    int i = 0;
    while(i < nums.length && nums[i] < target){
        if(nums[i] == target) return i;
        i++;
    }

    return i;
}
```

## 38. Count and Say

The count-and-say sequence is the sequence of integers with the first five terms as following:

1.     1
2.     11
3.     21
4.     1211
5.     111221
1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.

Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.

Note: Each term of the sequence of integers will be represented as a string.

 

Example 1:

Input: 1
Output: "1"
Example 2:

Input: 4
Output: "1211"

```java
public static String countAndSay(int n) {
        String str = "1";
        int i = 2;

        while (i <= n) {
            StringBuilder temp = new StringBuilder();
            char prev = str.charAt(0);
            int count = 1;
            int j = 1;
            while (j < str.length()) {
                char curr = str.charAt(j);
                if(prev != curr){
                    temp.append(count);
                    temp.append(prev);
                    count =1;
                    prev = curr;
                } else count++;
                j++;
            }

            temp.append(count);
            temp.append(prev);

            str = temp.toString();

            i++;
        }

        return str;
    }
```
  



## 53. Maximum Subarray 
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.

Notes : it have the Big O of N so we have to itr throught the array for only once 
we have start and end so if the 

-2 1 -3 4 -1 2 1 -5 4 
   |               |

to get the sumasion of all the element and the max sum would be the addition of all the positive as well as the negative but if i use the window then it will give me the big o of the n2 but we want the big o of n 
so we have to just itetrate throught the all the element once 
i guess i have to move the start and end 


```java
```


## 104. Maximum Depth of Binary Tree

Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Note: A leaf is a node with no children.

Example:

Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
return its depth = 3.

recursive Solution
```java
public int maxDepth(TreeNode root) {
    if(root == null) return 0;
    int leftHeight = maxDepth(root.left);
    int rightHeight = maxDepth(root.right);


    return Math.max(leftHeight, rightHeight)+1;
}
```

Iterative Solution

Create a queue.
Push root into the queue.
height = 0
Loop
    nodeCount = size of queue
        
        // If the number of nodes at this level is 0, return height
    if nodeCount is 0
        return Height;
    else
        increase Height

        // Remove nodes of this level and add nodes of 
        // next level
    while (nodeCount > 0)
        pop node from front
        push its children to queue
        decrease nodeCount
       // At this point, queue has nodes of next level

```java
public static int maxDepthIter(TreeNode root) {

    if(root == null) return 0;

    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    int height = 0;

    while (true) {
        int nodecount = q.size();
        if(nodecount == 0) return height;
        height++;

        while (nodecount > 0) {
            TreeNode curr = q.peek();
            q.remove();

            if(curr.left != null) q.add(curr.left);
            if(curr.right != null) q.add(curr.right);
            nodecount --;
        }
    }
}
```


## 107. Binary Tree Level Order Traversal II

Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]

for level binary tree we have to itreate through the level by level 
so we use queue(FIFO) . 
first we add root to q 
then we check if it have the left and right node 
remove the first element from q 
we repeat this process till there's nothing in q

```java
public static List<List<Integer>> levelOrderBottom(TreeNode root) {
    List<List<Integer>> list = new ArrayList<>();
    if(root == null) return list;
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    while(true){
        int nodecount = q.size();
        if(nodecount == 0) break;
        List<Integer> subList = new ArrayList<Integer>();

        while(nodecount > 0){
            TreeNode curr = q.peek();
            subList.add(curr.val);
            q.remove();
            if(curr.left!= null) q.add(curr.left);
            if(curr.right!= null) q.add(curr.right);

            nodecount --;
        }
        list.add(0,subList);
    }

    return list;
}
```

## 108. Convert Sorted Array to Binary Search Tree
Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

Example:

Given the sorted array: [-10,-3,0,5,9],

One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:

      0
     / \
   -3   9
   /   /
 -10  5


recursive method 
which i can just increase the array index and 
recursively it will 
