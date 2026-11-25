import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class DefaultCustomArrayListTest {

    @Test
    void addGetAndSizeWork() {
        CustomArrayList<String> list = new DefaultCustomArrayList<>();

        assertTrue(list.add("first"));
        assertTrue(list.add("second"));

        assertEquals(2, list.size());
        assertEquals("first", list.get(0));
        assertEquals("second", list.get(1));
        assertFalse(list.isEmpty());
    }

    @Test
    void listSupportsNullElements() {
        CustomArrayList<String> list = new DefaultCustomArrayList<>();

        assertTrue(list.add(null));
        assertTrue(list.add("value"));

        assertTrue(list.contains(null));
        assertEquals(null, list.get(0));
        assertTrue(list.remove(null));
        assertFalse(list.contains(null));
        assertEquals("value", list.get(0));
    }

    @Test
    void removeDeletesOnlyFirstMatchingElement() {
        CustomArrayList<String> list = new DefaultCustomArrayList<>();
        list.add("same");
        list.add("other");
        list.add("same");

        assertTrue(list.remove("same"));
        assertEquals(2, list.size());
        assertEquals("other", list.get(0));
        assertEquals("same", list.get(1));
        assertFalse(list.remove("missing"));
    }

    @Test
    void capacityGrowsWhenMoreThanTenElementsAreAdded() {
        CustomArrayList<Integer> list = new DefaultCustomArrayList<>();

        for (int i = 0; i < 25; i++) {
            list.add(i);
        }

        assertEquals(25, list.size());
        for (int i = 0; i < 25; i++) {
            assertEquals(i, list.get(i));
        }
    }

    @Test
    void clearRemovesAllElements() {
        CustomArrayList<String> list = new DefaultCustomArrayList<>();
        list.add("one");
        list.add(null);

        list.clear();

        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
        assertFalse(list.contains("one"));
        assertFalse(list.contains(null));
    }

    @Test
    void iteratorReturnsElementsAndThrowsWhenExhausted() {
        CustomArrayList<String> list = new DefaultCustomArrayList<>();
        list.add("one");
        list.add(null);

        Iterator<String> iterator = list.iterator();

        assertTrue(iterator.hasNext());
        assertEquals("one", iterator.next());
        assertTrue(iterator.hasNext());
        assertNull(iterator.next());
        assertFalse(iterator.hasNext());
        assertThrows(NoSuchElementException.class, iterator::next);
    }

    @Test
    void getRejectsInvalidIndexes() {
        CustomArrayList<String> list = new DefaultCustomArrayList<>();
        list.add("only");

        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1));
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(1));
    }
}
