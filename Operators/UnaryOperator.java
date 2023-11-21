package org.operators;

public class UnaryOperator {
    public static void main(String[] args) {
//       Unary Operator
        
        // (a)'-' operand
        int n = 10;
        //Performing unary operation
        n = -n;
        //After unary operation
        System.out.println("n value = "+n);


        // (b)'!' NOT Operator
        boolean isMarried = false;
        System.out.println("Are you married:"+!(isMarried));

    }
}
