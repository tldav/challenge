package stack.challenge;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
public class ExpressionTests {
    @DataProvider
    public static Object[][] scenarios() {
        return new Object[][]{
                {true, "()"},
                {true, "(({1} [+] <>2))"},
                {false, "{(()()"},
                {false, ")("},
                {false, ""}
        };
    }
    
    @Test(dataProvider = "scenarios")
    public void isValid(boolean expected, String input) {
        boolean actual = Expression.getInstance(input).isValid();
        Assert.assertEquals(actual, expected);
    }
}
