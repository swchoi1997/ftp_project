package org.example.lib.time;

import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.example.base.EBase;

public enum ETimeZone implements EBase<String> {

    SEOUL("Asia/Seoul"),
    NEW_YORK("America/New_York"),
    LONDON("Europe/London"),
    TOKYO("Asia/Tokyo"),
    PARIS("Europe/Paris"),
    BEIJING("Asia/Shanghai"),
    SYDNEY("Australia/Sydney"),
    SAO_PAULO("America/Sao_Paulo"),
    MOSCOW("Europe/Moscow"),
    DELHI("Asia/Kolkata");

    private static final Map<ETimeZone, String> timezone =
            Collections.unmodifiableMap(
                    Stream.of(values()).collect(Collectors.toMap(Function.identity(), ETimeZone::Get)));
    private final String timeZoneId;

    ETimeZone(String timeZoneId) {
        this.timeZoneId = timeZoneId;
    }

    @Override
    public String Get() {
        return timeZoneId;
    }

    public static String Find(ETimeZone eTimeZone) {
        return timezone.get(eTimeZone);
    }
}
