public class Collection<E> {
    public Node<E> one = null;
    public int size = 0;

    public Collection() {}
    public void add(E item) {
        Node<E> newNode = new Node<>(item);
        if (one == null) {
            one = newNode;
        } else {
            Node<E> currNode = one;
            while (currNode.next != null) currNode = currNode.next;
            currNode.next = newNode;
        }
        this.size += 1;
    }

    public int getSize() {
        return size;
    }

    public void remove(int index) {
        if (index == 0) {
            one = one.next;
        } else {
            Node<E> prevNode = null;
            Node<E> currNode = one;
            for (int i = 0; i < index; i++) {
                prevNode = currNode;
                currNode = currNode.next;
            }

            prevNode.next = currNode.next;
        }
        size -= 1;
    }

    public void remove(E item) {
        if (item.equals(one.value)) {
            one = one.next;
        } else {
            Node<E> prevNode = null;
            Node<E> currNode = one;
            while(currNode.next != null) {
                prevNode = currNode;
                currNode = currNode.next;
                if (item.equals(currNode.value)) {
                    prevNode.next = currNode.next;
                    break;
                }
            }
        }
        size -= 1;
    }

    public E get(int index) {
        Node<E> currNode = one;
        for (int i = 0; i<index; i++) currNode = currNode.next;
        return currNode.value;
    }

    public void clear() {
        one = null;
        size = 0;
    }

    class Node<E> {
        public E value;
        public Node<E> next = null;
        public Node(E item) {
            this.value = item;
        }
    }
}
