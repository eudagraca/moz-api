package moz.api.model;

public enum  Location {
    CENTER("Centro"),
    NORTH("Norte"),
    SOUTH("Sul"),
    EAST("Este"),
    WEST("Oeste");

    private final String value;

    Location(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
