package com.kulamarcin;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
    private static boolean isBalanced(String query){

        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < query.length(); i++) {

            if(query.charAt(i) == '(' || query.charAt(i) == '[' || query.charAt(i) == '{')
                stack.push(query.charAt(i));

            if(query.charAt(i) == ')' || query.charAt(i) == ']' || query.charAt(i) == '}') {
                if(stack.empty())
                    return false;

                if(query.charAt(i) == '}') {
                    if(stack.peek() == '{')
                        stack.pop();
                    else
                        return false;
                }

                if(query.charAt(i) == ')') {
                    if(stack.peek() == '(')
                        stack.pop();
                    else
                        return false;
                }

                if(query.charAt(i) == ']') {
                    if(stack.peek() == '[')
                        stack.pop();
                    else
                        return false;
                }
            }
        }
        return stack.empty();
    }

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            String input = scanner.next();
            System.out.println(JavaStack.isBalanced(input));
        }
        scanner.close();
    }
}
