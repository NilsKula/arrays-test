package teamcalypso;

public class Iterator<E extends Storage> {

    private final E[] array;
    private final int currentSize;
    private int currentIndex = 0;

    public Iterator(E[] data) {
        this.array = data;
        this.currentSize = data.length;
    }

    public boolean hasNext() {
        return currentIndex < currentSize && array[currentIndex] != null;
    }

    public E next() {
        return array[currentIndex++];
    }
}
