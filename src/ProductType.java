public enum ProductType {
    LIBRARY("Library products"),
    ELECTRONIC("Electronic products"),
    OTHERS("OTHERS items");

    private final String description;


    ProductType(String description) {
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
