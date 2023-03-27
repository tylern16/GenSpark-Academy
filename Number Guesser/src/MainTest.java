import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void setOutput() {
        for (int i = 1; i < 21; i++) {
            for (int j = 1; j < 21; j++) {
                if (i > j) {
                    assertEquals(Main.setOutput(i,j,"chief",3), "Your guess is too high. Guess again:");
                } else if (i < j) {
                    assertEquals(Main.setOutput(i,j,"chief",3), "Your guess is too low. Guess again:");
                } else {
                    assertEquals(Main.setOutput(i,j,"chief",3), "Good job, chief! You guessed my number in 3 guesses!");
                }
            }
        }
    }
}