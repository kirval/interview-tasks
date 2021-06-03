package tasks.java.min_pair_sum;

import java.util.PriorityQueue;

public class PriorityQueueMinPairSum {

    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int sum = 0;
        queue.offer(5);
        queue.offer(8);
        queue.offer(2);
        queue.offer(3);

        if (queue.size() == 1) {
            System.out.println(queue);
            sum += queue.peek();
            System.out.println("Sum = " + sum);
        } else if (queue.size() > 1) {
            System.out.println(queue);
            while (queue.size() >= 2) {
                int minSum = queue.poll() + queue.poll();
                queue.offer(minSum);
                sum += minSum;
                System.out.println(queue);
            }
        }
        System.out.println("\nMinimal sum = " + sum);

    }

}
