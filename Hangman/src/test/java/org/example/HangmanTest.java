package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HangmanTest {

    @Test
    void genRandomWordTest() {
        for (int i = 0; i < 100; i ++) {
            RandomWord r = new RandomWord();
            if (r.genRandomWord().length() > 1) {
                assertTrue(true);
            } else {
                assertTrue(false);
            }
        }
    }

    @Test
    void showCorrectLettersTest() {
        Hangman h = new Hangman();
        assertEquals(h.showCorrectLetters("ca", "cat"), "ca_" );
        assertEquals(h.showCorrectLetters("rdm", "random"), "r__d_m" );
    }

    @Test
    void checkForWInTest() {
        Hangman h = new Hangman();
        assertEquals(h.checkForWin("otter", "rteo"), true);
        assertEquals(h.checkForWin("botter", "rteo"), false);
        assertEquals(h.checkForWin("abcdefghijklmnopabcdefghijklmnop", "abcdefghijklmnop"), true);
    }
}