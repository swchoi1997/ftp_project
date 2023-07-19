package org.example.lib.time;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CTimeZoneTest {

    @Test
    void defaultConstructTest() {
        CTimeZone cTimeZone = new CTimeZone();
        assertThat(cTimeZone).isEqualTo(new CTimeZone());
        assertThat(cTimeZone.getTimeZoneId()).isEqualTo(ETimeZone.SEOUL.Get());
        assertThat(cTimeZone.getTimeZone()).isEqualTo(TimeZone.getDefault());
    }

    @Test
    void oneConstructTest1() {
        CTimeZone cTimeZone = new CTimeZone(ETimeZone.SEOUL);
        assertThat(cTimeZone).isEqualTo(new CTimeZone(ETimeZone.SEOUL));
        assertThat(cTimeZone.getTimeZoneId()).isEqualTo(ETimeZone.SEOUL.Get());
        assertThat(cTimeZone.getTimeZone()).isEqualTo(TimeZone.getDefault());
    }

    @Test
    void oneConstructTest2() {
        CTimeZone cTimeZone = new CTimeZone(ETimeZone.SEOUL.Get());
        assertThat(cTimeZone).isEqualTo(new CTimeZone(ETimeZone.SEOUL.Get()));
        assertThat(cTimeZone.getTimeZoneId()).isEqualTo(ETimeZone.SEOUL.Get());
        assertThat(cTimeZone.getTimeZone()).isEqualTo(TimeZone.getDefault());
    }

    @Test
    void getCurrentTimeByTimeZone()
    {
        assertThat(new CTimeZone().getTime())
                .isEqualTo(
                        LocalDateTime.now().format(DateTimeFormatter.ofPattern(ETimeForm.YYYYMMDDHH24MISS.Get()))
                );
    }

    //TODO TimeCalculator 생성 후 테스트


}