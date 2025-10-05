import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();
        // In this we can insert and remove elements from front and rear both

        adq.offer(23);
        adq.offerLast(45);
        adq.offerFirst(12);
        adq.offer(26);
        adq.offerFirst(36);

        System.out.println(adq);

        System.out.println(adq.peek());     // element at 1st place
        System.out.println(adq.peekFirst()); // element at 1st place
        System.out.println(adq.peekLast()); // element at last

        System.out.println(adq.poll());     // remove element from 1st
        System.out.println("poll() " + adq);

        System.out.println(adq.pollFirst()); // remove element from 1st
        System.out.println("pollFirst() " + adq);

        System.out.println(adq.pollLast());   // remove element from last
        System.out.println("pollLast() " + adq);
    }
}
