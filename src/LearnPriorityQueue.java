import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {

        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        /*
            by default the priority queue is implementing min heap under the hood,
            so the lowest element is at the first place
        */
        /*
            Comparator.reverseOrder() will implement the max heap under the hood
            so the highest element is at the first place
         */

        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        System.out.println(pq);

        pq.poll(); // it will remove the element which is present at the first place
        System.out.println(pq);

        System.out.println(pq.peek()); // it will print the element which is present at the first place
    }
}
