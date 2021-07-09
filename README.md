# UMass Boston CS 310
[Discription](https://www.overleaf.com/read/bzrtjywkdnsk)

# Project 2

## Submission of Project 2

- Way of submission: Submit the three files {Meetings.java ThreeEqualParts.java ChangesCom-
  parator.java CoinChanging.java} to the Gradescope
- If your code compiles, you get 10 points.

## 1 Meetings (25 Points)

Given an array of meeting time intervals where intervals[i] = [ _starti, endi_ ], determine if a person
could attend all meetings.

public static boolean all(int[][] meetings){
/*
* code
* */
  return true;
  }

Example 1:
Input: intervals = [[0,30],[5,10],[15,20]]
Output: false

Example 2:
Input: intervals = [[7,10],[2,4]]
Output: true

## 2 CoinChanging

### 2.1 CoinChange

- This is a predefined class which you should not modify.
- It represents for a given coins collection and a change, the corresponding changes and total
  amount of coins.


- Example,

```
Change:
Amount:
Coins:
[1, 2, 3, 6, 7, 8, 10]
Changes:
[[0, 0, 0, 1, 0, 1, 0]]
Actual:
```
```
Interprets as: 14 = 6 * 1 + 8 * 1
```
public class CoinChange {
public int change;
public int amount;
public int[] coins;
public int[] changes;

```
public CoinChange(int change, int amount, int[] coins) ;
public CoinChange(int change, int amount, int[] coins, int[] changes);
```
@Override
public String toString();
}

### 2.2 ChangesComparator (10 Points)

Given two changes for the same coins collection and the same change, we compare the changes by
the amount of larger coin denominations.

```
@Override
public int compare(int[] changes1, int[] changes2) {
/*
* code
* */
return 0;
}
```
Example 1:


Input: changes1 = [1,0, 1], changes = [0,2,0]
Output: 1
Explain:
change: 4
coins: [1,2,3]

changes1: 1 * 1 + 3 * 1 = 4
changes2: 2 * 2 = 4

Since changes1 has one coin of 3 which is large than any coin
changes2 has, so changes1 is considered bigger thus return 1

Example 2:
change: 6
coin: [1, 2, 6]

Input: changes1 = [0, 3, 0], changes = [0,0,1]
Output: -

### 2.3 CoinChanging (30 Points)

Given a coins collecion and a change, return the CoinChange which has the smallest amount of
coins. If the smallest amount of coins for the change has many different changes representation,
choose the larger one defined by the previous ChangesComparator. If these is no possible changes,
return a CoinChange variable with amount = 1 and changes equal all zero.

Example 1:

change: 4
coins: [1,2,3]

changes1: 1 * 1 + 3 * 1 = 4
changes2: 2 * 2 = 4

Input: 4, [1,2,3]
Output:
CoinChange:
change: 4
amount: 2
coins: [1,2,3]
changes: [1, 0 , 1 ]

Example 2:


input:
change: 1
coin: [2, 3, 4]

Output:
CoinChange:
change: 1
amount: -
coins: [1,2,3]
changes: [0, 0 , 0 ]

## 3 ThreeEqualParts (25 Points)

Given an array of integers arr, return true if we can partition the array into three non-empty parts
with equal sums.
Formally, we can partition the array if we can find indexes i + 1 < j with (arr[0] + arr[1] + ...
+ arr[i] == arr[i + 1] + arr[i + 2] + ... + arr[j - 1] == arr[j] + arr[j + 1] + ... + arr[arr.length -
  1])

Example 1:
Input: arr = [0,2,1,-6,6,-7,9,1,2,0,1]
Output: true
Explanation: 0 + 2 + 1 = -6 + 6 - 7 + 9 + 1 = 2 + 0 + 1

Example 2:
Input: arr = [0,2,1,-6,6,7,9,-1,2,0,1]
Output: false

Example 3:
Input: arr = [3,3,6,5,-2,2,5,1,-9,4]
Output: true
Explanation: 3 + 3 = 6 = 5 - 2 + 2 + 5 + 1 - 9 + 4


