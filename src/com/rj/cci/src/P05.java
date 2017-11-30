package com.rj.cci.src;

import java.util.Stack;

public class P05 {
    public static boolean areBracketsBalanced(String s) {
        Stack<Character> bracketsStack =  new Stack<>();
        char[] stringSplit = s.toCharArray();
        for (char c : stringSplit) {
            switch (c){
                case '{':
                case '[':
                case '(':
                    bracketsStack.push(c);
                    break;
                case '}':
                    if(!bracketsStack.empty() && bracketsStack.peek() == '{')
                        bracketsStack.pop();
                    else return false;
                    break;
                case ']':
                    if(!bracketsStack.empty() && bracketsStack.peek() == '[')
                        bracketsStack.pop();
                    else return false;
                    break;

                case ')':
                    if(!bracketsStack.empty() && bracketsStack.peek() == '(')
                        bracketsStack.pop();
                    else return false;
                    break;
            }
        }
        return bracketsStack.empty();
    }
}
