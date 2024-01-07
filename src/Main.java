import lists.LinkedList;

public class Main {
    public static void main(String[] args) {
       LinkedList<Integer> list = new LinkedList<>();
        list.insertStart(3);
        list.insertEnd(5);
        System.out.println(list.get(0));
        list.insertStart(2);
        System.out.println(list.get(0));
    }
}