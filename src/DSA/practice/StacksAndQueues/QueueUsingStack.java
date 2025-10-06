package DSA.practice.StacksAndQueues;

import java.util.Stack;

public class QueueUsingStack {
    class MyQueue {
        private Stack<Integer> first;
        private Stack<Integer> second;

        public MyQueue() {
            first = new Stack<>();
            second = new Stack<>();
        }

        public void push(int x) {
            while (!first.empty()) {
                second.push(first.pop());
            }
            first.push(x);
            while (!second.empty()) {
                first.push(second.pop());
            }
        }

        public int pop() {
            return first.pop();
        }

        public int peek() {
            return first.peek();
        }

        public boolean empty() {
            return first.isEmpty();
        }
    }
}
