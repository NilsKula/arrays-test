package teamcalypso;

import static java.lang.Character.isUpperCase;
import static java.lang.System.arraycopy;

public class Filter<E extends Storage> {
    private final E[] storage;

    public Filter(E[] data) {
        this.storage = data;
    }

    public Storage[] capitalTypeFilter() {
        int leng = storage.length;

        for (int i = 0; i < leng; i++) {
            char[] letters = storage[i].getType().toCharArray();
            for (char letter : letters) {
                if (isUpperCase(letter)) {
                    storage[i] = storage[i + 1];
                    i--;
                    leng--;
                    break;
                }
            }
        }
        Storage[] x = new Storage[leng];

        arraycopy(storage, 0, x, 0, leng);
        return x;
    }
}
