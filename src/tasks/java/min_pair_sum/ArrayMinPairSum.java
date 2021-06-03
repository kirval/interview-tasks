package tasks.java.min_pair_sum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayMinPairSum {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(3);

        if (list.size() == 1) {
            sum += list.get(0);
        } else if (list.size() > 1) {
            System.out.println(list);
            while (list.size() >= 2) {
                Collections.sort(list);
                Integer minSum = list.get(0) + list.get(1);
                list.remove(0);
                list.remove(0);
                list.add(minSum);
                sum += minSum;
                System.out.println(list);
            }
        }
        System.out.println("\nMinimal sum = " + sum);
    }

}
