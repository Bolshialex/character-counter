import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterFrequencyCounterTest {
    @Test
    public void testLAppearsThreeTimesInHelloWorld(){
        // Arrange
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hello world");
        // Act
        int actualCount = counter.getFrequency('l');
        // Assert
        assertEquals(3,actualCount);
    }

    @Test
    public void testZAppearsZeroPercentInString(){
        
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hi there");

        double percentCount = counter.getRelativePercentage('z');

        assertEquals(0.0, percentCount, 0.0001);
    }
}