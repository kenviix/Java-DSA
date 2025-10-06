package DSA.practice.StacksAndQueues;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

    class MyStack {

        private Queue<Integer> q;

        public MyStack() {
            q = new LinkedList<>();
        }

        public void push(int x) {
            q.offer(x);
            int n = q.size();

            for (int i = 0; i < n-1; i++) {
                q.offer(q.poll());
            }
        }

        public int pop() {
            return q.poll();
        }

        public int top() {
            return q.peek();
        }

        public boolean empty() {
            return q.isEmpty();
        }
    }


}
