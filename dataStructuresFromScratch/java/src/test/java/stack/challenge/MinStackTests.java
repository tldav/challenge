package stack.challenge;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
public class MinStackTests {
    @DataProvider
    public static Object[][] scenarios_min() {
        return new Object[][]{
                {1, new MinStack(new Integer[]{5, 2, 10, 1})},
                {2, new MinStack(new Integer[]{5, 2, 10})},
                {78, new MinStack(new Integer[]{201, 199, 78, 871, 91})}
        };
    }
    
    @DataProvider
    public static Object[][] scenarios_push_minStack() {
        return new Object[][]{
                {-6}
        };
    }
    
    @Test(dataProvider = "scenarios_min")
    public void min(int expected, MinStack minStack ) {
        int actual = minStack.min();
        Assert.assertEquals(actual, expected);
    }
    
    @Test(dataProvider = "scenarios_push_minStack")
    public void push_minStack(int expected) {
        MinStack minStack = new MinStack(new Integer[]{5, 2, 10, 1});
        int originalMin = minStack.min();
        minStack.push(-6);
        int updatedMin = minStack.min();
        boolean minUpdatedCorrectly = updatedMin <= originalMin;
        Assert.assertTrue(minUpdatedCorrectly);
    }
}
