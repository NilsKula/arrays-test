package teamcalypso;

public class Sorter<E extends Storage> {

    private final E[] storage;

    public Sorter(E[] data) {
        this.storage = data;
    }

    public E[] sort() {
        E temporary;
        for (int i = 0; i < storage.length; i++) {
            for (int j = 0; j < storage.length; j++) {
                if (storage[i].getSize() == storage[j].getSize()) {
                    if (storage[i].getType().compareTo(storage[j].getType()) < 0) {
                        temporary = storage[i];
                        storage[i] = storage[j];
                        storage[j] = temporary;
                    }
                }
                if (storage[i].getSize() > storage[j].getSize()) {
                    temporary = storage[i];
                    storage[i] = storage[j];
                    storage[j] = temporary;

                }
            }
        }
        return storage;
    }
}
