package main.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void decision() {
        assertEquals(Main.decision("1"), """
                    You approach the cave...\s
                    It is dark and spooky...\s
                    A large dragon jumps out in front of you! He opens his jaw and...\s
                    Gobbles you down in one bites!
                    """);
        assertEquals(Main.decision("2"), "The dragon shares his gold with you!");
    }
}