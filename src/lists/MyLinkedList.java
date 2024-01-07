package lists;

public interface MyLinkedList<T> {
    void insertStart(T element);
    void insertEnd(T element);
    int size();
    T get(int index);
}
