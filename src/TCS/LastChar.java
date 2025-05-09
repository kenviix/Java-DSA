package TCS;

/*

## Problem Statement

Write a Java program to print the last character of every word in a given string

### Conditions

Ignore all the digits and whitespaces

## Input

    Hey3 Java   Learners

## Output

    as

## Explanation

> As the first word `Hey3` has digit in its last position, ignore it.
> The second word `Java` has multiple white spaces after it. But those white spaces should be ignored and only the last character should be printed.
> Likewise, the last character of the word `Learners` should be printed.
> Thus, the output `as`.


 */

import java.util.Scanner;

public class LastChar {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        s.close();
        String[] strArr = str.split("\\s+");
        StringBuilder newStr = new StringBuilder();
        for(String strs:strArr){
            char ch = strs.charAt(strs.length() - 1);
            if(!Character.isDigit(ch) && !Character.isWhitespace(ch)){
                newStr.append(ch);
            }
        }
        System.out.println(newStr);
    }
}
