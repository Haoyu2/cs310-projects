# cs310-projects

[Discription](https://www.overleaf.com/read/jhpbfxxxnbcw)

# UMass Boston CS 240

# Project 1

## Submission of Homework 1

- Way of submission: Submit the three files {Graph.java MinOpera.java Utils.java} to the
  Gradescope

## 1 Utils

### 1.1 Primitive Array and Object Array Conversion (20 Points)

Implement all these conversion in the Utils.java

### 1.2 Convert a list of integer array to a 2 dimensional array (10 Points)

Implement this conversion in the Utils.java

## 2 MinOpera (15 Points)

You are given an integer array nums (0-indexed).
In one operation, you can choose an element of the array and increment it by 1.

For example, if nums = [1,1,3], you can choose to increment nums[1] to make nums
= [1,2,3].
Return the minimum number of operations needed to make nums strictly increasing.

Example 1:

Input: nums = [1,1,1]
Output: 3
Explanation: You can do the following operations:
1) Increment nums[2], so nums becomes [1,1,2].
2) Increment nums[1], so nums becomes [1,2,2].
3) Increment nums[2], so nums becomes [1,2,3].
   Example 2:

Input: nums = [1,5,2,4,1]


Output: 14
Example 3:

Input: nums = [8]
Output: 0

Hint:

This question can be solved by a Greedy Algorithm that for an element that does not
strictly increasing, just increment it by the minimum amount that makes it strictly
increasing. Add all these amount together to get the total operations.

## 3 Graph

### 3.1 edges2adj (10 Points)

You are given the number of nodes and all the edges for a graph. You should return
an array representation of its adjacent list for all its nodes (0,1,2,...,n-1).

Example 1:
Input: n = 5, edges = [[0,1],[1,2],[3,4]]
Output: [[1], [0, 2], [1], [4], [3]]

Example 2:
Input: n = 5, edges = [[0,1],[1,2],[2,3],[3,4], [3, 0]]
Output: [[1, 3], [0, 2], [1, 3], [2, 4, 0], [3]]

### 3.2 numComponent (15 Points)

You are given a graph by its ajacent list representation.
Return the number of connected components in the graph.

Example 1:
Input: [[1], [0, 2], [1], [4], [3]]
Output: 2

Example 2:
Input: [[1], [0, 2], [1, 3], [2, 4], [3]]
Output: 1


### 3.3 containsCycle (15 Points)

You are given a graph by its ajacent list representation.
Return if there is cycle in the graph.

Example 1:
Input: [[1], [0, 2], [1], [4], [3]]
Output: false

Example 2:
Input: [[1, 3], [0, 2], [1, 3], [2, 4, 0], [3]]
Output: true

### 3.4 isBipartite (15 Points)

You are given a graph by its ajacent list representation.
Return if this graph is a bipartite.

Example 1:
Input: [[1], [0, 2], [1], [4], [3]]
Output: true

Example 2:
Input: [[1, 3], [0, 2], [1, 3], [2, 4, 0], [3]]
Output: true


Example 3:
Input: [[3,4,6],[3,6],[3,6],[0,1,2,5],[0,7,8],[3],[0,1,2,7],[4,6],[4],[]]
Output: false


