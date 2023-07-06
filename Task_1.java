/**
 *                  Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет
                                        “перевернутый” список.
 */


package HomeWork_4;

import java.util.*;

public class Task_1 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("I");
        ll.add("He");
        ll.add("She");
        ll.add("They");
        ll.add("Your");
        ll.add("We");
        System.out.println(ll);
        System.out.println(revll(ll));
    }
    static Deque<String> revll(LinkedList<String> ll) {
    Deque<String> deque = new ArrayDeque<String>();
        for (String el : ll){
            deque.addFirst(el);
        }
        return deque;
    }

}