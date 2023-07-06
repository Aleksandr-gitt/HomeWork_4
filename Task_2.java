/**
 *                  Реализуйте очередь с помощью LinkedList со следующими методами:
                    enqueue() - помещает элемент в конец очереди, 
                    dequeue() - возвращает первый элемент из очереди и удаляет его, 
                    first() - возвращает первый элемент из очереди, не удаляя.
 */

package HomeWork_4;

import java.util.Deque;
import java.util.LinkedList;

public class Task_2 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("I");
        ll.add("He");
        ll.add("She");
        ll.add("They");
        ll.add("Your");
        ll.add("We");
        String last = "last element";
        System.out.println("Первоначальный список : " + ll);
        System.out.println("С добавлением элемента в конец списка : " + queue(ll,last));
        System.out.println("Без первого элемента : " + deque(ll));
        System.out.println("Первый элемент : " + first(ll));
    }
    
    static LinkedList<String> queue(LinkedList<String> ll,String elem){
        ll.add(elem);
        return ll;
    }
    
    static Deque<String> deque(LinkedList<String> ll){
        //Deque<String> deque = new ArrayDeque<String>(ll);
        ll.poll();
        return ll;
    }
    static String first(LinkedList<String> ll){
        return ll.peek();
    }    
    
}
