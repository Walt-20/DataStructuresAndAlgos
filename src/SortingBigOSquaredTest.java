import static org.junit.Assert.*;

public class SortingBigOSquaredTest {

    @org.junit.Test
    public void insertion() {
        int[] orgArr = {1, 3, 2, 6, 4, 7, 5};
        int[] expArr = {1, 2, 3, 4, 5, 6, 7};
        SortingBigOSquared.insertion(orgArr);
        assertArrayEquals(expArr, orgArr);
    }

    @org.junit.Test
    public void selection() {
        int[] orgArr = {1, 3, 2, 6, 4, 7, 5};
        int[] expArr = {1, 2, 3, 4, 5, 6, 7};
        SortingBigOSquared.selection(orgArr);
        assertArrayEquals(expArr, orgArr);
    }

    @org.junit.Test
    public void bubble() {
        int[] orgArr = {5, 2, 3, 6, 4, 1, 7};
        int[] expArr = {1, 2, 3, 4, 5, 6, 7};
        SortingBigOSquared.bubble(orgArr);
        assertArrayEquals(expArr, orgArr);
    }
}