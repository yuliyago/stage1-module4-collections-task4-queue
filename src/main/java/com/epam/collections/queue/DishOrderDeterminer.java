package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> lst = new ArrayList<>();
        Deque<Integer> numbers=new ArrayDeque<>();
        for (int i=1;i<=numberOfDishes;i++) {
            numbers.add(i);
        }
        int counter=1;
       while (!numbers.isEmpty()){
           int i=numbers.poll();
           if(counter%everyDishNumberToEat==0) lst.add(i);
           else numbers.add(i);
           counter++;
       }
        return lst;
    }

    public static void main(String[] args) {
        DishOrderDeterminer obj=new DishOrderDeterminer();
        obj.determineDishOrder(10,3);
    }
}
