public class Main {
    static void main() {
        /*megjegyzés, bármilyen néven lehetett volna implementálni az osztályt,
          a numbets csak az miatt lett, mert számokat szeretnék bele tölteni */

        Numbers<Integer> numbers1 = new Numbers<>(5);
        Numbers<Integer> numbers2 = new Numbers<>(5);

        //Bemutatok néhány exceptiont:

        /*numbers1.removeFirst();
        numbers1.getFirst();
        numbers1.removeLast();
        numbers1.getLast();*/

        /*
        //elejéhez adás
        numbers1.addFirst(1);
        numbers1.addFirst(2);
        numbers1.addFirst(3);
        numbers1.addFirst(4);
        numbers1.addFirst(5);

        numbers1.printElements();
        separator();

        //végéhez adás
        numbers2.addFirst(5);
        numbers2.addFirst(4);
        numbers2.addFirst(3);
        numbers2.addFirst(2);
        numbers2.addFirst(1);

        numbers2.printElements();
        */

        /*
        //elejéhez adás offerrel
        numbers1.offerFirst(1);
        numbers1.offerFirst(2);
        numbers1.offerFirst(3);
        numbers1.offerFirst(4);
        numbers1.offerFirst(5);

        numbers1.printElements();
        separator();

        //végéhez adás offerrel
        numbers2.offerFirst(5);
        numbers2.offerFirst(4);
        numbers2.offerFirst(3);
        numbers2.offerFirst(2);
        numbers2.offerFirst(1);

        numbers2.printElements();
        */

        /*
        numbers1.addFirst(1);
        numbers1.addFirst(2);
        numbers1.addFirst(3);
        numbers1.addFirst(4);
        numbers1.addFirst(5);

        numbers1.printElements();
        separator();

        numbers2.addFirst(5);
        numbers2.addFirst(4);
        numbers2.addFirst(3);
        numbers2.addFirst(2);
        numbers2.addFirst(1);

        numbers2.printElements();
        separator();

        //elveszünk az elejéről
        numbers1.removeFirst();
        numbers2.pollFirst();

        numbers1.printElements();
        separator();
        numbers2.printElements();
        separator();

        //elveszünk a végéről
        numbers1.removeLast();
        numbers2.pollLast();

        numbers1.printElements();
        separator();
        numbers2.printElements();
        */

        /*
        numbers1.addFirst(1);
        numbers1.addFirst(2);
        numbers1.addFirst(3);
        numbers1.addFirst(4);
        numbers1.addFirst(5);

        //megnézzük az elejét és a végét

        System.out.println(numbers1.getFirst());
        System.out.println(numbers1.peekFirst());
        System.out.println(numbers1.getLast());
        System.out.println(numbers1.peekLast());
        */

        /*
        //FIFO példa
        numbers1.addLast(1);
        numbers1.addLast(2);
        numbers1.addLast(3);

        numbers1.printElements();
        separator();

        numbers1.removeFirst();
        numbers1.removeFirst();

        numbers1.printElements();

         */

        /*
        //LIFO példa

        numbers1.addFirst(1);
        numbers1.addFirst(2);
        numbers1.addFirst(3);

        numbers1.printElements();
        separator();

        numbers1.removeFirst();
        numbers1.removeFirst();

        numbers1.printElements();


         */

    }
    static void separator() {
        System.out.println("-------------------------------------");
    }
}