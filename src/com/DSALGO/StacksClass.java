package com.DSALGO;
import java.util.Stack;


public class StacksClass {

public static void main(String args[]){
        Stack<Integer> sc = new Stack<>();
        sc.push(1);
        sc.push(3);
        sc.push(4);

        while (!sc.isEmpty()){
            System.out.println(sc.peek());
            sc.pop();
        }

        ReversStack r = new ReversStack();
        r.revers(sc);

//    PushAtBottom p = new PushAtBottom();
//    p.pushAtBottom(sc,5);
}
}
