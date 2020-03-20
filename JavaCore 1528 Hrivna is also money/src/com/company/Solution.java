package com.company;

/*

Correct the Hrivna class to avoid a StackOverflowError error.

Requirements:
1. The Hrivna class must be a descendant of the Money class.
2. In the Hrivna class, the getAmount method must be implemented.
3. The getAmount method in the Hrivna class should return the value of the amount field.
4. During the execution of the program, NO exceptions or errors should occur.


 */


public class Solution {
    public static void main(String[] args) {
        System.out.println(new Hrivna().getAmount());
    }

    public static abstract class Money {
        abstract Money getMoney();

        public Object getAmount() {
            return getMoney().getAmount();
        }
    }

    //add your code below - добавь код ниже
    public static class Hrivna extends Money {
        public double amount = 123d;

        public Hrivna getMoney() {
            return this;
        }

        public Double getAmount() {
            return amount;
        }
    }
}

