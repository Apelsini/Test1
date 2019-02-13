package class8testing;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static class7collections.Otsenki.countAloneElements;
import static class7collections.Otsenki.countUnique;

public class OtsenkiTEstCase {
    @Test
    public void testCountUnique(){

        Assert.assertEquals(3, countUnique(Arrays.asList(8, 8, 9, 9, 9, 10)));
        Assert.assertEquals(3, countUnique(Arrays.asList(1, 2, 3)));
    }
}

