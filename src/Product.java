import java.math.BigDecimal;
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


}
