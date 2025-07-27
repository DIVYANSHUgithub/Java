package org.example.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice{
    public static void main(String[] args)  {
        /* There are two types of queues
        1- Capacity-Restricted
        2- no capacity Restriction
            1- Capacity Restricted
                example->   1-ArrayBlockingQueue
                            2-LinkedBlockingQueue
                            3-PriorityBlockingQueue
            2- no Capacity Restriction
                example->   1-LinkedList
                            2-PriorityQueue
        In Queues there are two types of methods
        1- if there will be any operation failures it returns exception.
        2- if there will be any operation failures it returns false.

        1 --->> example -- add(), remove(), element()
        2 --->> example -- offer(), poll(), peek()

        Q-> Why insertion operations fails?
           -It fails because the queues have capacity and out of capacity it fails
        Q-> Why offer() method is used at the place of add() method
           - Because if operation fails add() method return exception i.e(IllegalStateException) and
             it interrupts the whole program
             so, at the place of that if we will use offer() method and at the time of operation failures
             it returns false  and didn't interrupt whole program.

         */
        Queue<Integer> queue=new LinkedList<>();

        //offer() method
        queue.offer(4);
        queue.offer(20);
        // add() method
        queue.add(1);
        queue.add(4);
        // addAll() method
        // poll() method
        queue.poll();
        // element() method
        // peek() method
        System.out.println(queue.peek());
        // equals() method
        // contains() method
        // containsAll() method
        // isEmpty() method
        // size() method
        // retainAll() method
        // clear() method
        // remove() method
        // removeAll() method
        // removeIf() method
        // iterator() method
        // spliterator() method
        // toArray() method
        // toArray() method
        // toArray() method
        // stream() method

        try{

            Thread.sleep(1000);
            System.out.println("hello");
        } catch (Exception e) {
            System.out.println("2");
        }

    }
}
