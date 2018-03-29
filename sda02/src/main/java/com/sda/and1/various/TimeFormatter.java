package com.sda.and1.various;

import org.assertj.core.api.Assertions;

public class TimeFormatter {
    public static int[] units = {60, 3600, 86400};
    public static String[] names = {"minute", "hour", "day"};

    public static void main(String[] args) {
        Assertions.assertThat(format(62)).isEqualTo("1 minute and 2 seconds");
        Assertions.assertThat(format(3662)).isEqualTo("1 hour, 1 minute and 2 seconds");
    }

    private static String format(int seconds) {
        StringBuilder resultText = new StringBuilder();
        for (int i = units.length - 1; i >= 0; i--) {
            if (seconds > units[i]) {
                int count = seconds / units[i];
                seconds -= count * units[i];
                resultText.append(count).append(" ").append(names[i]);
                if (i > 0) {
                    resultText.append(", ");

                }
            }
        }
        resultText.append(" and ").append(seconds).append(" seconds");
        return resultText.toString();
    }
}
