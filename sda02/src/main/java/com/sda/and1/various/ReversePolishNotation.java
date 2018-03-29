package com.sda.and1.various;

import org.assertj.core.api.Assertions;

public class ReversePolishNotation {
    // https://pl.wikipedia.org/wiki/Odwrotna_notacja_polska
    //expression 5 1 2 + 4 * + 3 - (which is equivalent to 5 + ((1 + 2) * 4) - 3 in normal notation) should evaluate to 14
    public static void main(String[] args) {
        Assertions.assertThat(calculate("5 1 2 + 4 * + 3 -")).isEqualTo(14);
    }

    private static int calculate(String input) {
        return 0;
    }
}
