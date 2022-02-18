package com.DSALGO;
import java.util.Stack;


public class PushAtBottom {
    public void pushAtBottom(Stack s, int bottomVal){
        Stack<Integer> temp1 = new Stack<>();

        while (!s.isEmpty()){
            int a = (int) s.peek();
            temp1.push(a);
            s.pop();
        }

        s.push(bottomVal);

        while (!temp1.isEmpty()){
            int a = (int) temp1.peek();
            s.push(a);
            temp1.pop();
        }

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
