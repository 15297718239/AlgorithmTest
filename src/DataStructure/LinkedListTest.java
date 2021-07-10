package DataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListTest {
    public static void main(String[] a) {
//        LinkedList list = new LinkedList();
//        list.add("A");
//        list.add("B");
//        list.add("C");
//        list.add("D");
//        list.addFirst("X");
//        list.addLast("Z");
//        list.removeLast();
//        System.out.println(list);
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1); // 元素 1 入队
        queue.offer(2); // 元素 2 入队
        queue.poll();   // 出队 -> 元素 1
//        queue.poll();   // 出队 -> 元素 2
        System.out.println(queue);
    }
} 