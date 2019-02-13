package class8testing;

import org.junit.Assert;
import org.junit.Test;


import java.util.Arrays;

import static class7collections.Otsenki.countAloneElements;

public class OtsenkiTEstCase {
    @Test
    public void testCountUnique(){

        Assert.assertEquals(1, countAloneElements(Arrays.asList(2, 2, 3)));
        Assert.assertEquals(3, countAloneElements(Arrays.asList(1, 2, 3)));
    }
}

