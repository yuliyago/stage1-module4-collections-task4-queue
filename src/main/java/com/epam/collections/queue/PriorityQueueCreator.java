package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {

    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        List<String> lst = new ArrayList<>(firstList);
        lst.addAll(secondList);
        PriorityQueue<String> queue = new PriorityQueue<>(new QueueComparator());
        queue.addAll(lst);
        return queue;
    }


}
