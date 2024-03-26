package _Agrichain_;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AgrichainLongestSubstringTest {
    @Test
    public void testLongestSubstring() throws InterruptedException {
        AgrichainLongestSubstring agrichainLongestSubstring = new AgrichainLongestSubstring();
        String input = "abcabcbb";
        String expectedOutput = "abc";

        String actualOutput = agrichainLongestSubstring.getLongestSubstring(input);

        Assert.assertEquals(actualOutput, expectedOutput, "Incorrect longest substring found!");
    }
}
