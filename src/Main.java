import util.ArrayDequeHelper;

public class Main {

    static void main() {
        /*megjegyzés, bármilyen néven lehetett volna implementálni az osztályt,
          a numbers csak az miatt lett, mert számokat szeretnék bele tölteni */

        ArrayDequeHelper<Integer> arrayDequeHelper1 = new ArrayDequeHelper<>(5);
        ArrayDequeHelper<Integer> arrayDequeHelper2 = new ArrayDequeHelper<>(5);

        //Deque<String> myDeque = new ArrayDeque<>(5);

        //Bemutatok néhány exceptiont:

        //ehhez kellett a maxSize implementáció, mivel a generic verziója végtelenig növelhető
        //arrayDequeHelper1.removeFirst();
        //arrayDequeHelper1.getFirst();
        //arrayDequeHelper1.removeLast();
        //arrayDequeHelper1.getLast();

        /*
        //elejéhez adás
        arrayDequeHelper1.addFirst(1);
        arrayDequeHelper1.addFirst(2);
        arrayDequeHelper1.addFirst(3);
        arrayDequeHelper1.addFirst(4);
        arrayDequeHelper1.addFirst(5);

        arrayDequeHelper1.printElements();
        separator();

        //végéhez adás
        arrayDequeHelper2.addFirst(5);
        arrayDequeHelper2.addFirst(4);
        arrayDequeHelper2.addFirst(3);
        arrayDequeHelper2.addFirst(2);
        arrayDequeHelper2.addFirst(1);

        arrayDequeHelper2.printElements();
         */


        /*
        //elejéhez adás offerrel
        arrayDequeHelper1.offerFirst(1);
        arrayDequeHelper1.offerFirst(2);
        arrayDequeHelper1.offerFirst(3);
        arrayDequeHelper1.offerFirst(4);
        arrayDequeHelper1.offerFirst(5);

        arrayDequeHelper1.printElements();
        separator();

        //végéhez adás offerrel
        arrayDequeHelper2.offerFirst(5);
        arrayDequeHelper2.offerFirst(4);
        arrayDequeHelper2.offerFirst(3);
        arrayDequeHelper2.offerFirst(2);
        arrayDequeHelper2.offerFirst(1);

        arrayDequeHelper2.printElements();
         */
        

        /*
        arrayDequeHelper1.addFirst(1);
        arrayDequeHelper1.addFirst(2);
        arrayDequeHelper1.addFirst(3);
        arrayDequeHelper1.addFirst(4);
        arrayDequeHelper1.addFirst(5);

        arrayDequeHelper1.printElements();
        separator();

        arrayDequeHelper2.addFirst(5);
        arrayDequeHelper2.addFirst(4);
        arrayDequeHelper2.addFirst(3);
        arrayDequeHelper2.addFirst(2);
        arrayDequeHelper2.addFirst(1);

        arrayDequeHelper2.printElements();
        separator();

         */

        /*
        //elveszünk az elejéről
        arrayDequeHelper1.removeFirst();
        arrayDequeHelper2.pollFirst();

        arrayDequeHelper1.printElements();
        separator();
        arrayDequeHelper2.printElements();
        separator();

        //elveszünk a végéről
        arrayDequeHelper1.removeLast();
        arrayDequeHelper2.pollLast();

        arrayDequeHelper1.printElements();
        separator();
        arrayDequeHelper2.printElements();
         */
        

        /*
        arrayDequeHelper1.addFirst(1);
        arrayDequeHelper1.addFirst(2);
        arrayDequeHelper1.addFirst(3);
        arrayDequeHelper1.addFirst(4);
        arrayDequeHelper1.addFirst(5);

        //megnézzük az elejét és a végét

        System.out.println(arrayDequeHelper1.getFirst());
        System.out.println(arrayDequeHelper1.peekFirst());
        System.out.println(arrayDequeHelper1.getLast());
        System.out.println(arrayDequeHelper1.peekLast());

         */
        

        /*
        //FIFO példa
        arrayDequeHelper1.addLast(1);
        arrayDequeHelper1.addLast(2);
        arrayDequeHelper1.addLast(3);

        arrayDequeHelper1.printElements();
        separator();

        arrayDequeHelper1.removeFirst();
        arrayDequeHelper1.removeFirst();

        arrayDequeHelper1.printElements();

         */

         

        /*
        
        //LIFO példa

        arrayDequeHelper1.addFirst(1);
        arrayDequeHelper1.addFirst(2);
        arrayDequeHelper1.addFirst(3);

        arrayDequeHelper1.printElements();
        separator();

        arrayDequeHelper1.removeFirst();
        arrayDequeHelper1.removeFirst();

        arrayDequeHelper1.printElements();

         */
        

    }
    static void separator() {
        System.out.println("-------------------------------------");
    }
}