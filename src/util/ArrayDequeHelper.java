package util;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeHelper<E> {

    private int maxSize;
    private Deque<E> deque;

    public ArrayDequeHelper(int maxSize) {
        this.maxSize = maxSize;
        this.deque = new ArrayDeque<>();
    }

    //addFirst implementáció
    public void addFirst(E element) {
        if (deque.size() >= maxSize) {
            //kivételt dob!
            throw new IllegalStateException("Megtelt! Nem lehet az elejehez hozzaadni!");
        }
        deque.addFirst(element);
    }

    //addLast implementáció
    public void addLast(E element) {
        if (deque.size() >= maxSize) {
            //kivételt dob!
            throw new IllegalStateException("Megtelt! Nem lehet a vegehez hozzaadni!");
        }
        deque.addLast(element);
    }

    //offerFirst implementáció
    public boolean offerFirst(E element) {
        if (deque.size() >= maxSize) {
            return false;
        }
        return deque.offerFirst(element);
    }

    //offerLast implementáció
    public boolean offerLast(E element) {
        if (deque.size() >= maxSize) {
            return false;
        }
        return deque.offerLast(element);
    }

    //removeFirst implementáció
    public E removeFirst() {
        if (deque.isEmpty()) {
            //kivételt dob!
            throw new java.util.NoSuchElementException("Ures! Nem lehet az elejerol eltavolitani");
        }
        return deque.removeFirst();
    }

    //removeLast implementáció
    public E removeLast() {
        if (deque.isEmpty()) {
            //kivételt dob!
            throw new java.util.NoSuchElementException("Ures! Nem lehet a vegerol eltavolitani");
        }
        return deque.removeLast();
    }

    //pollFirst implementáció
    public E pollFirst() {
        return deque.pollFirst();
    }

    //pollLast implementáció
    public E pollLast() {
        return deque.pollLast();
    }

    //getFirst implementáció
    public E getFirst() {
        if (deque.isEmpty()) {
            //kivételt dob!
            throw new java.util.NoSuchElementException("Ures! Nincs az elejen semmi!");
        }
        return deque.getFirst();
    }

    //getLast implementáció
    public E getLast() {
        if (deque.isEmpty()) {
            //kivételt dob!
            throw new java.util.NoSuchElementException("Ures! Nincs a vegen semmi!");
        }
        return deque.getLast();
    }

    //peekFirst implementáció
    public E peekFirst() {
        return deque.peekFirst();
    }

    //peekLast implementáció
    public E peekLast() {
        return deque.peekLast();
    }

    //kiíratás
    public void printElements() {
        for (E element : deque) {
            System.out.println(element);
        }
    }
}
