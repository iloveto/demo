package dataStructure.stack;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Stack s = new Stack();
        char[] charArray = {'a','b','c'};
        for (char c : charArray) {
            s.push(c);
        }
        while(!s.isEmpty()){
            System.out.print(s.pop());
        }
    }
}
