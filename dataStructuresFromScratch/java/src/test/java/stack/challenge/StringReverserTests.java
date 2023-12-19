package stack.challenge;

import org.testng.Assert;
import org.testng.annotations.Test;

@SuppressWarnings("SpellCheckingInspection")
@Test
public class StringReverserTests {
    @Test
    public void reverse() {
        StringReverser stringReverser = new StringReverser();
        String expected = "edcba";
        String actual = stringReverser.reverse("abcde");
        Assert.assertEquals(actual, expected);
    }
}