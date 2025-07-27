package org.example.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

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
        Queue<Integer> queue=new ArrayBlockingQueue<>(4);

        //offer() method
                    // it will insert into the queue without violating capacity restriction
                    // return true if successful inserted otherwise return false.
                    queue.offer(4);// true
                    queue.offer(20); // true
                    queue.offer(20); // true


        // add() method
                    // it will insert into the queue without violating capacity restriction
                    // return true if successful inserted otherwise return IllegalStateException.
                    queue.add(1);// true

        // offer() method used to  show false state of offer() method
                    queue.offer(20);// false
        /*--->>*/   //queue.add(4); // exception


        // addAll() method

        // poll() method
                    // it will retrieves and remove the head element of the queue
                    // returns element on successful removal or null me queue will be empty
                            queue.poll();//-> 4
                            queue.poll();// -> 20
                            queue.poll();// -> 20
                            queue.poll();// ->1
                            queue.poll();// null

        // element() method
            // it retrieves the head element without removing that
            // it returns element if retrieves successfully otherwise it returns exception if the queue will empty
                //queue.element();// exception
                queue.add(4);
                queue.element();// 4


        // peek() method
            // it retrieves the head element without removing that
            // it returns element if retrieves successfully otherwise it returns null if the queue will empty
                queue.peek();//4
                queue.poll();// 4
                queue.peek();//null
        // equals() method
        queue.equals(4);
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

    }
}
