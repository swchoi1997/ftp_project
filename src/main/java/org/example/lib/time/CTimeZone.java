package org.example.lib.time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Objects;
import java.util.TimeZone;

public class CTimeZone {

    private final ZoneId timeZone;
    private final String timeZoneId;

    public CTimeZone() {
        this(TimeZone.getDefault().getID());
    }
    public CTimeZone(final String desiredTimeZoneId) {
        this(ZoneId.of(desiredTimeZoneId), desiredTimeZoneId);
    }

    public CTimeZone(final ETimeZone desiredTimeZoneId) {
        this(ZoneId.of(desiredTimeZoneId.Get()), ETimeZone.Find(desiredTimeZoneId));
    }

    private CTimeZone(ZoneId timeZone, ETimeZone timeZoneId) {
        this(timeZone, ETimeZone.Find(timeZoneId));
    }
    private CTimeZone(ZoneId timeZone, String timeZoneId) {
        this.timeZone = timeZone;
        this.timeZoneId = timeZoneId;
    }

    public ZoneId getTimeZone() {
        return timeZone;
    }

    public String getTimeZoneId() {
        return timeZoneId;
    }

    public String getTime() {
        return this.getTime(ETimeForm.YYYYMMDDHH24MISS);
    }

    public String getTime(ETimeForm eTimeForm) {
        final LocalDateTime time = LocalDateTime.now(timeZone);
        return CTimeUtils.convertTimeFormat(time, eTimeForm);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CTimeZone cTimeZone = (CTimeZone) o;
        return Objects.equals(timeZone, cTimeZone.timeZone) && Objects.equals(timeZoneId,
                cTimeZone.timeZoneId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeZone, timeZoneId);
    }

    @Override
    public String toString() {
        return "CTimeZone{" +
                "timeZone=" + timeZone +
                ", timeZoneId='" + timeZoneId + '\'' +
                '}';
    }
}
