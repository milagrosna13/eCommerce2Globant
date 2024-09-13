public enum StatusCart {
    DRAFT("DRAFT"),
    SUBMITTED("SUBMITTED");


    private final String description;


    StatusCart(String description) {
        this.description = description;
    }


    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return name() + ": " + description;
    }
}
