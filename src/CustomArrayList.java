public interface CustomArrayList<E> extends Iterable<E> {
    boolean add(E element);
    boolean remove(E element);
    E get(int index);
    int size();
    boolean isEmpty();
    void clear();
    boolean contains(E element);
}
