package org.example.lib.time;

import java.time.format.DateTimeFormatter;
import org.example.base.EBase;

public enum ETimeForm implements EBase<String> {

    NONE("None"),
    YYYYMMDDHH24MISS("yyyyMMddHHmmss"),
    YYYYMMDDHH24MI("yyyyMMddHHmm"),
    YYYYMMDDHH24("yyyyMMddHH"),
    YYYYMMDD("yyyyMMdd"),
    YYYYMM("yyyyMM"),
    YYYY("yyyy");


    private final String form;

    ETimeForm(String form) {
        this.form = form;
    }

    @Override
    public String Get() {
        return form;
    }

    public static DateTimeFormatter getDateTimeFormatter(final ETimeForm eTimeForm) {
        return DateTimeFormatter.ofPattern(eTimeForm.Get());
    }
}
