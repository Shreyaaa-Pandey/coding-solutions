# Java Int to String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer $n$, you have to convert it into a string.

Please complete the partially completed code in the editor. If your code successfully converts $n$ into a string $s$ the code will print "*Good job*". Otherwise it will print "*Wrong answer*".

$n$ can range between $-100$ to $100$ inclusive.

**Input Format**

 

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-20T13:03:47.388Z  

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = String.valueOf(n);

        if (n == Integer.parseInt(s)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }

        sc.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-int-to-string/problem)