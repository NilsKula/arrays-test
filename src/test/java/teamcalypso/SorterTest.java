package teamcalypso;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SorterTest {
    private Sorter<Storage> sorter;

    @Test
    public void testSortBySize() {
        final Storage[] storage = new Storage[]{
                new Storage(1, "Test 1", 5),
                new Storage(2, "Test 2", 1),
                new Storage(2, "Test 2", 9),
        };

        sorter = new Sorter<>(storage);
        Storage[] result = sorter.sort();

        assertEquals(9, result[0].size);
        assertEquals(5, result[1].size);
        assertEquals(1, result[2].size);
    }

    @Test
    public void testSortByTypeWhenSizeEqual() {
        final Storage[] storage = new Storage[]{
                new Storage(1, "CCC", 5),
                new Storage(2, "BBB", 5),
                new Storage(2, "AAA", 5),
        };

        sorter = new Sorter<>(storage);
        Storage[] result = sorter.sort();

        assertEquals("AAA", result[0].type);
        assertEquals("BBB", result[1].type);
        assertEquals("CCC", result[2].type);
    }
}