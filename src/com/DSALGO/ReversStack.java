package com.DSALGO;

import java.util.Stack;

public class ReversStack {
    public void revers (Stack s) {
        Stack<Integer> s1 =  new Stack<>();
        while (!s.isEmpty()) {
            int a = (int) s.peek();
            s1.push(a);
            s.pop();
        }

        while (!s1.isEmpty()) {
            System.out.println(s1.peek());
            s1.pop();
        }
    }
}
