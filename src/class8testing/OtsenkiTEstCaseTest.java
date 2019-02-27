package class8testing;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static class7collections.Otsenki.countUnique;
import static org.junit.Assert.*;

*
 * Created by user on 13.02.2019.


public class OtsenkiTEstCaseTest {
    @Test
    public void testCountUnique() throws Exception {
        Assert.assertEquals(3, countUnique(Arrays.asList(8, 8, 9, 9, 9, 10)));
        Assert.assertEquals(2, countUnique(Arrays.asList(1, 2, 3)));
    }

}
