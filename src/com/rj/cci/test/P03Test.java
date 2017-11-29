package com.rj.cci.test;

import com.rj.cci.src.P03;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P03Test {
    @Test
    void test() {

        String a = "apgo clm w lxkvg mwz elo bg elo lxkvg elo apgo apgo w elo bg";
        String b = "elo lxkvg bg mwz clm w";
        Assertions.assertEquals(new P03(a,b).solve(), true);
    }

}