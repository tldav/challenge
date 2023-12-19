package stack;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
public class StackTests {
    
    private static final String FIRST_ITEM = "first item";
    private static final String SECOND_ITEM = "second item";
    private static final String THIRD_ITEM = "third item";
    private static final String[] WITH_ONE_STRING = {FIRST_ITEM};
    private static final String[] WITH_TWO_STRINGS = {FIRST_ITEM, SECOND_ITEM};
    private static final String[] WITH_THREE_STRINGS = {FIRST_ITEM, SECOND_ITEM, THIRD_ITEM};
    
    @DataProvider
    public static Object[][] scenarios_isEmpty() {
        Stack<Object> stack_empty = new Stack<>();
        Stack<String> stack_withTwoStrings = new Stack<>(WITH_TWO_STRINGS);
        return new Object[][]{
                {true, stack_empty},
                {false, stack_withTwoStrings}
            
        };
    }
    
    @DataProvider
    public static Object[][] scenarios_isFull() {
        Stack<Object> stack_empty = new Stack<>();
        Stack<String> stack_withTwoStrings = new Stack<>(WITH_TWO_STRINGS);
        return new Object[][]{
                {true, stack_empty},
                {false, stack_withTwoStrings}
        };
    }
    
    @DataProvider
    public static Object[][] scenarios_size() {
        Stack<Object> stack_empty = new Stack<>();
        Stack<String> stack_withOneString = new Stack<>(WITH_ONE_STRING);
        Stack<String> stack_withThreeStrings = new Stack<>(WITH_THREE_STRINGS);
        return new Object[][]{
                {0, stack_empty},
                {1, stack_withOneString},
                {3, stack_withThreeStrings},
        };
    }
    
    @SuppressWarnings("rawtypes")
    @Test(dataProvider = "scenarios_isEmpty")
    public void isEmpty(boolean expected, Stack stack) {
        boolean actual = stack.isEmpty();
        Assert.assertEquals(actual, expected);
    }
    
    @SuppressWarnings({"rawtypes", "unchecked"})
    @Test(dataProvider = "scenarios_isFull")
    public void isFull(boolean expected, Stack stack) {
        stack.push("an item");
        boolean actual = stack.isFull();
        Assert.assertEquals(actual, expected);
    }
    
    @SuppressWarnings("rawtypes")
    @Test(dataProvider = "scenarios_size")
    public void size(int expected, Stack stack) {
        int actual = stack.size();
        Assert.assertEquals(actual, expected);
    }
    
    @Test
    public void push() {
        Stack<String> stack = new Stack<>();
        int expected_size = stack.size() + 1;
        String expected_item = "added to stack";
        String actual_item = stack.push("added to stack");
        int actual_size = stack.size();
        Stack<String> expected = new Stack<>(new String[]{"added to stack"});
        Stack<String> actual = new Stack<>();
        actual.push(expected_item);
//        Assert.assertEquals(actual_item, expected_item);
//        Assert.assertEquals(actual_size, expected_size);
        Assert.assertEquals(actual.toString(), expected.toString());
    }
    
    @Test
    public void pop() {
        Stack<String> stack = new Stack<>();
        stack.push("1");
        int expected_size = stack.size() - 1;
        String expected_item = "1";
        String actual_item = stack.pop();
        int actual_size = stack.size();
        Assert.assertEquals(actual_item, expected_item);
        Assert.assertEquals(actual_size, expected_size);
    }
    
    @Test
    public void peek() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        int actual = stack.peek();
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }

//    @Test
//    public void min() {
//        Stack<Integer> stack = new MinStack<>(new Integer[]{5, 2, 10, 1});
//        int actual = stack.min();
//        int expected = 1;
//        Assert.assertEquals(actual, expected);
//    }
}
