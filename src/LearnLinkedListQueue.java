import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        //FIFO

        queue.offer(12);
        queue.offer(24);
        queue.offer(36);    // it will insert the element in queue
//        queue.add(48); // it also insert element, but if task is unsuccessful then it will throw exception

        System.out.println(queue);

        System.out.println(queue.poll()); // it will remove the element which is at first place and, we can also print that element
        queue.remove(); // it also throws exception if the task is unsuccessful

        System.out.println(queue);

        System.out.println(queue.peek()); // it will print the element which is at first place
        queue.element(); // it also throws exception if the task is unsuccessful

    }
}
