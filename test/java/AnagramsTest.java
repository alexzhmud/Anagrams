import com.company.AnagramExaminer;
import org.junit.Assert;
import org.junit.Test;


public class AnagramsTest {
    private AnagramExaminer anagrams = new AnagramExaminer();

    @Test
    public void testInputWordsPositive() {
        Assert.assertTrue(anagrams.isAnagram("abcdef", "bcdaef"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInputWordsDifferentLength() {
        Assert.assertFalse(anagrams.isAnagram("abcdef", "bd"));
    }

    @Test
    public void testInputWordsSameLengthLength() {
        Assert.assertFalse(anagrams.isAnagram("abcdef", "abcdee"));
    }

    @Test(expected = NullPointerException.class)
    public void testNullArgs() {
        Assert.assertFalse(anagrams.isAnagram(null, null));
    }
}