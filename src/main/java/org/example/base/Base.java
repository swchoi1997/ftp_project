package org.example.base;

public enum Base implements EBase<String>{
    BLANK(" "),
    NONE("");

    private final String value;

    Base(String value) {
        this.value = value;
    }

    @Override
    public String Get() {
        return value;
    }
}
