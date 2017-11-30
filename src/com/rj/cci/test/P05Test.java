package com.rj.cci.test;

import com.rj.cci.src.P05;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class P05Test {
    @Test void iB_01() { Assertions.assertEquals(true, P05.areBracketsBalanced("{[()]}")); }
    @Test void iB_02() { Assertions.assertEquals(true, P05.areBracketsBalanced("{{[[(())]]}}")); }
    @Test void iB_03() { Assertions.assertEquals(true, P05.areBracketsBalanced("()[{}()]([[][]()[[]]]{()})([]()){[]{}}{{}}{}(){([[{}([]{})]])}")); }
    @Test void iB_04() { Assertions.assertEquals(false, P05.areBracketsBalanced("{][({(}]][[[{}]][[[())}[)(]([[[)][[))[}[]][()}))](]){}}})}[{]{}{((}]}{{)[{[){{)[]]}))]()]})))[")); }
    @Test void iB_05() { Assertions.assertEquals(false, P05.areBracketsBalanced("[)](][[([]))[)")); }
    @Test void iB_06() { Assertions.assertEquals(false, P05.areBracketsBalanced("]}]){[{{){")); }
    @Test void iB_07() { Assertions.assertEquals(false, P05.areBracketsBalanced("{[(}{)]]){(}}(][{{)]{[(((}{}{)}[({[}[}((}{()}[]})]}]]))((]][[{{}[(}})[){()}}{(}{{({{}[[]})]{((]{[){[")); }
    @Test void iB_08() { Assertions.assertEquals(false, P05.areBracketsBalanced("()}}[(}])][{]{()([}[}{}[{[]{]](]][[))(()[}(}{[{}[[]([{](]{}{[){()[{[{}}{[{()(()({}([[}[}[{(]})")); }
    @Test void iB_09() { Assertions.assertEquals(false, P05.areBracketsBalanced("){[])[](){[)}[)]}]]){](]()]({{)(]])(]{(}(}{)}])){[{}((){[({(()[[}](]})]}({)}{)]{{{")); }
    @Test void iB_10() { Assertions.assertEquals(false, P05.areBracketsBalanced("[(})])}{}}]{({[]]]))]})]")); }
    @Test void iB_11() { Assertions.assertEquals(false, P05.areBracketsBalanced("[{")); }
    @Test void iB_12() { Assertions.assertEquals(true, P05.areBracketsBalanced("{}([{()[]{{}}}])({})")); }
    @Test void iB_13() { Assertions.assertEquals(true, P05.areBracketsBalanced("{({}{[({({})([[]])}({}))({})]})}")); }
    @Test void iB_14() { Assertions.assertEquals(true, P05.areBracketsBalanced("()[]")); }
    @Test void iB_15() { Assertions.assertEquals(false, P05.areBracketsBalanced("{)[])}]){){]}[(({[)[{{[((]{()[]}][([(]}{](])()(}{(]}{})[)))[](){({)][}()((")); }
    @Test void iB_16() { Assertions.assertEquals(true, P05.areBracketsBalanced("[][(([{}])){}]{}[()]{([[{[()]({}[])()()}[{}][]]])}")); }
    @Test void iB_17() { Assertions.assertEquals(false, P05.areBracketsBalanced("(}]}")); }
    @Test void iB_18() { Assertions.assertEquals(true, P05.areBracketsBalanced("(([{()}]))[({[{}{}[]]{}})]{((){}{()}){{}}}{}{{[{[][]([])}[()({}())()({[]}{{[[]]([])}})()]]}}")); }
    @Test void iB_19() { Assertions.assertEquals(false, P05.areBracketsBalanced("[(([){[](}){){]]}{}([](([[)}[)})[(()[]){})}}]][({[}])}{(({}}{{{{])({]]}[[{{(}}][{)([)]}}")); }
    @Test void iB_20() { Assertions.assertEquals(true, P05.areBracketsBalanced("()()[()([{[()][]{}(){()({[]}[(((){(())}))]()){}}}])]")); }
    @Test void iB_21() { Assertions.assertEquals(false, P05.areBracketsBalanced("({)}]}[}]{({))}{)]()(](])})][(]{}{({{}[]{][)){}{}))]()}((][{]{]{][{}[)}}{)()][{[{{[[")); }
    @Test void iB_22() { Assertions.assertEquals(false, P05.areBracketsBalanced(")}(()[])(}]{{{}[)([})]()}()]}(][}{){}}})}({](){([()({{(){{")); }
    @Test void iB_23() { Assertions.assertEquals(false, P05.areBracketsBalanced("}([]]][[){}}[[)}[(}(}]{(}[{}][{}](}]}))]{][[}(({(]}[]{[{){{(}}[){[][{[]{[}}[)]}}]{}}(}")); }

}