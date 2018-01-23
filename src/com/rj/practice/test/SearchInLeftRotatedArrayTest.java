package com.rj.practice.test;

import com.rj.practice.src.SearchInLeftRotatedArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchInLeftRotatedArrayTest {
    @Test
    void search() {
        assertEquals(3, SearchInLeftRotatedArray.worstCaseSearch(new int[]{3, 4, 5, 1, 2}, 1));
        assertEquals(3, SearchInLeftRotatedArray.bestCaseSearch(new int[]{1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9}, 4));
        assertEquals(0, SearchInLeftRotatedArray.bestCaseSearch(new int[]{1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9}, 1));
        assertEquals(8, SearchInLeftRotatedArray.bestCaseSearch(new int[]{1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9}, 9));
    }
}