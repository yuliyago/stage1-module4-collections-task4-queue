package com.epam.collections.queue;

import java.util.Comparator;

class QueueComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
      return a.compareTo(b)*-1;
    }
}