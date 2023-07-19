package org.example.lib.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CTimeUtils {

    public static String convertTimeFormat(final LocalDateTime localDateTime,
                                           final ETimeForm eTimeForm) {
        return localDateTime
                .format(ETimeForm.getDateTimeFormatter(eTimeForm));
    }

    public static String convertTimeFormat(final String stringDateTime,
                                           final ETimeForm eTimeForm) {
        return LocalDateTime.parse(stringDateTime)
                .format(ETimeForm.getDateTimeFormatter(eTimeForm));
    }
}
