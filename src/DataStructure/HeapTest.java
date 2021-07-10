package DataStructure;

import java.util.PriorityQueue;
import java.util.Queue;

public class HeapTest {
    public static void main(String[] args) {
        // 初始化小顶堆
        Queue<Integer> heap = new PriorityQueue<>();
// 元素入堆
        heap.add(1);
        heap.add(4);
        heap.add(2);
        heap.add(6);
        heap.add(8);
// 元素出堆（从小到大）
        heap.poll(); // -> 1
        heap.poll(); // -> 2
        heap.poll(); // -> 4
        heap.poll(); // -> 6
        heap.poll(); // -> 8
        System.out.println(heap.poll());
        System.out.println(heap.poll());
        System.out.println(heap.poll());
        System.out.println(heap.poll());

    }
}
