package lesson_16;

public class MyLinkedList<T> implements MyList<T>{
    private Node<T> head;

    @Override
    public void add(T elem) {
        // 1 -> 2 -> 3 -> 4 -> null
        Node<T> newElem = new Node<>(elem);
        if (head == null) {
            head = newElem;
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newElem;
        }
    }
    // 1 -> 2 -> 3 -> 4 -> 5
    // add 11 to position 3
    // 1 -> -> 2 -> 3 ->
    // 11 -> 4 -> 5

    // 1 -> 2 -> 3
    // remove at pos 1
    // current.next = current.next.next

    @Override
    public int size() {
        int counter = 0;
        Node<T> temp = head;
        while (temp != null) {
            counter++;
            temp = temp.next;
        }
        return counter;
    }

    @Override
    public T get(int index) {
        Node<T> temp = head;
        int counter = 0;
        while (temp != null) {
            if (counter == index) {
                return temp.data;
            }
            temp = temp.next;
            counter++;
        }
        return null;
    }

    @Override
    public void add(T elem, int index) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public boolean contains(T elem) {
        return false;
    }
}
