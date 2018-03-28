package com.sda.and1.various;

import org.assertj.core.api.Assertions;

public class TimeFormatter {
    public static void main(String[] args) {
        Assertions.assertThat(format(62)).isEqualTo("1 minute and 2 seconds");
        Assertions.assertThat(format(3662)).isEqualTo("1 hour, 1 minute and 2 seconds");
    }

    private static String format(int seconds) {
        return null;
    }
}
