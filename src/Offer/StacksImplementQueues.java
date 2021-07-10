package Offer;

import java.util.LinkedList;

public class StacksImplementQueues {
    LinkedList<Integer> A, B;

    public StacksImplementQueues() {
        A = new LinkedList<Integer>();
        B = new LinkedList<Integer>();
    }

    public void appendTail(int value) {
        A.addLast(value);
    }

    public int deleteHead() {
        if (!B.isEmpty())
            return B.removeLast();
        if (A.isEmpty())
            return -1;
        while (!A.isEmpty()) {
            B.addLast(A.removeLast());
            return B.removeLast();
        }
    }
}
