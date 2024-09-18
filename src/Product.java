import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

public class Product {

        private ProductType type;

        private static Long idCont = 0L;

        private Long id;
        private String name;
        private String description;
        /*CAMBIO DE DOUBLE A BIGDECIMAL PARA MAS PRECISION*/
        private BigDecimal price;


        public Product(String name, String description, BigDecimal price, ProductType type) {
            if(Objects.isNull(name)) throw new IllegalArgumentException("name cannot be null");
            if(Objects.isNull(description)) throw new IllegalArgumentException("description cannot be null");
            if(Objects.isNull(price)) throw new IllegalArgumentException("price cannot be null");

            this.id = ++idCont;
            this.name = name;
            this.description = description;
            this.price = price;
            this.type = type;
        }

        // Getters
        public Long getId() {
            return id;
        }
        public String getName() {
            return name;
        }
        public BigDecimal getPrice() {
            return price;
        }
        public ProductType getType() {
            return type;
        }

        @Override
        public String toString() {
            return String.format("%s | %s | %s | %s | %.2f", id, type, name, description, price);
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return type == product.type && Objects.equals(id, product.id) && Objects.equals(name, product.name) && Objects.equals(description, product.description) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, id, name, description, price);
    }
}
