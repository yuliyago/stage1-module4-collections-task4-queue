package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < 2; i++) {
            if (!firstQueue.isEmpty()) deque.add(firstQueue.poll());
        }
        for (int i = 0; i < 2; i++) {
            if (!secondQueue.isEmpty()) deque.add(secondQueue.poll());
        }
        while (!firstQueue.isEmpty() || !secondQueue.isEmpty()) {
            firstQueue.add(deque.pollLast());
            for (int i = 0; i < 2; i++) {
                if (!firstQueue.isEmpty()) deque.add(firstQueue.poll());
            }
            secondQueue.add(deque.pollLast());
            for (int i = 0; i < 2; i++) {
                if (!secondQueue.isEmpty()) deque.add(secondQueue.poll());
            }
        }
        return deque;
    }

    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        q1.add(1);
        q1.add(5);
        q1.add(7);
        q1.add(6);
        q2.add(2);
        q2.add(5);
        q2.add(8);
        q2.add(3);
        System.out.println("first queue");
        for (Integer i : q1) {
            System.out.print(i + " ");
        }
        System.out.println("\nsecond queue");
        for (Integer i : q2) {
            System.out.print(i + " ");
        }
        ArrayDequeCreator obj = new ArrayDequeCreator();
        System.out.println("\nbefore method");
        ArrayDeque<Integer> deque = obj.createArrayDeque(q1, q2);
        System.out.println("\nafter method");
        for (Integer i : deque) {
            System.out.print(i + " ");
        }
        System.out.println("first queue");
        for (Integer i : q1) {
            System.out.print(i + " ");
        }
        System.out.println("\nsecond queue");
        for (Integer i : q2) {
            System.out.print(i + " ");
        }
    }
}
