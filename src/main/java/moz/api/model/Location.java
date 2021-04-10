package moz.api.model;

public enum  Location {
    CENTER("Centro"),
    NORTH("Norte"),
    SOUTH("Sul");

    private final String value;

    Location(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
