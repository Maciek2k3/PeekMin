package com.Maciek;


import java.util.Stack;

public class GetMin {

    Stack<Integer> stack = new Stack();

    Stack<Integer> stackToTrack = new Stack();

    void push(int x) {
        stack.push(x);
        if (stack.size() == 1) {
            stackToTrack.push(x);
            return;
        }

        if (x < stackToTrack.peek())
            stackToTrack.push(x);
        else
            stackToTrack.push(stackToTrack.peek());
    }

    int getMin() {
        return stackToTrack.peek();
    }

    void pop() {
        stack.pop();
        stackToTrack.pop();
    }
}

