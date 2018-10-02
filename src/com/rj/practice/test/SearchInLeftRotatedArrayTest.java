package com.rj.practice.test;

import com.rj.practice.src.SearchInLeftRotatedArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchInLeftRotatedArrayTest {
    @Test
    void search() {
        assertEquals(3, SearchInLeftRotatedArray.worstCaseSearch(new int[]{3, 4, 5, 1, 2}, 1));
        assertEquals(3, SearchInLeftRotatedArray.bestCaseSearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 4));
        assertEquals(0, SearchInLeftRotatedArray.bestCaseSearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 1));
        assertEquals(8, SearchInLeftRotatedArray.bestCaseSearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 9));
    }

    @Test
    void search_2() {
        assertEquals(1, SearchInLeftRotatedArray.bestCaseSearch(new int[]{8, 9, 1, 2, 3, 4, 5, 6, 7}, 9));
        assertEquals(8, SearchInLeftRotatedArray.bestCaseSearch(new int[]{8, 9, 1, 2, 3, 4, 5, 6, 7}, 7));
        assertEquals(0, SearchInLeftRotatedArray.bestCaseSearch(new int[]{8, 9, 1, 2, 3, 4, 5, 6, 7}, 8));
        assertEquals(2, SearchInLeftRotatedArray.bestCaseSearch(new int[]{8, 9, 1, 2, 3, 4, 5, 6, 7}, 1));

        assertEquals(6, SearchInLeftRotatedArray.bestCaseSearch(new int[]{3, 4, 5, 6, 7, 8, 9, 1, 2}, 9));
        assertEquals(0, SearchInLeftRotatedArray.bestCaseSearch(new int[]{3, 4, 5, 6, 7, 8, 9, 1, 2}, 3));
        assertEquals(8, SearchInLeftRotatedArray.bestCaseSearch(new int[]{3, 4, 5, 6, 7, 8, 9, 1, 2}, 2));
        assertEquals(7, SearchInLeftRotatedArray.bestCaseSearch(new int[]{3, 4, 5, 6, 7, 8, 9, 1, 2}, 1));
        assertEquals(-1, SearchInLeftRotatedArray.bestCaseSearch(new int[]{3, 4, 5, 6, 7, 8, 9, 1, 2}, 19));
        assertEquals(4, SearchInLeftRotatedArray.bestCaseSearch(new int[]{2,2,2,3,4, 2}, 4));
    }
}