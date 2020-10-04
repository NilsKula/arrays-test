package teamcalypso;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FilterTest {
    private Filter<Storage> filter;

    @Test
    public void shouldRemoveUppercaseTypes() {
        final Storage[] storage = new Storage[]{
                new Storage(1, "test", 3),
                new Storage(2, "TEST", 4),
                new Storage(2, "tesT", 5),
        };

        filter = new Filter<>(storage);
        Storage[] result = filter.capitalTypeFilter();

        assertEquals(1, result.length);
        assertEquals("test", result[0].type);
    }
}
