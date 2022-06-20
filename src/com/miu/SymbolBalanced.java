package com.miu;

import java.util.Stack;

public class SymbolBalanced {
    Stack<Character> stack = new Stack<>();
    boolean isSymbolBalance(String s){
        for(int i  = 0; i < s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i) == '{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }
            if(s.charAt(i)==')'){
                if(!stack.isEmpty() && stack.peek() =='('){
                    stack.pop();
                }
                else return false;

            }
            if(s.charAt(i)=='}'){
                if(!stack.isEmpty() && stack.peek() =='{'){
                    stack.pop();
                }
                else return false;

            }
            if(s.charAt(i)==']'){
                if(!stack.isEmpty() && stack.peek() =='['){
                    stack.pop();
                }
                else return false;
            }
        }
        if(stack.isEmpty()) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        String exp1 = "[3+(4-9)]";
        SymbolBalanced symbolBalanced = new SymbolBalanced();
        System.out.println(symbolBalanced.isSymbolBalance(exp1));
    }
}
