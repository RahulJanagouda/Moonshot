package com.rj.appliedCs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class AnagramTest {
    @Test
    void isAnagram() {
        assertTrue(Anagram.isAnagram("ICEMAN","CINEMA"));
        assertFalse(Anagram.isAnagram("ICEMANN","CINEMA"));
        assertFalse(Anagram.isAnagram("ICEMANN","CINEMA"));
        assertFalse(Anagram.isAnagram("ICEMMN","CINEMA"));
        assertFalse(Anagram.isAnagram("IIIIII","CINEMA"));
    }
}