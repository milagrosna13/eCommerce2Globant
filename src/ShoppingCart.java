import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShoppingCart {



        private static Long idCont = 0L;
        private Long id;
        private Customer customer;
        private List<Product> products;
        private StatusCart status;

        public ShoppingCart(Customer customer) {
            this.id = ++idCont;
            this.customer = customer;
            this.products = new ArrayList<>();
            this.status = StatusCart.DRAFT;
        }

        public void addProduct(Product product) {
            products.add(product);
        }

        public void submit() {
            this.status = StatusCart.SUBMITTED;
        }

        public List<Product> getProducts() {
            return products;
        }
        public StatusCart getStatus() {
            return status;
        }
        public Long getId() {
            return id;
        }

    /*PRECIO ES EN BIGDECIMAL*/
        public BigDecimal calculateTotalPrice() {
            BigDecimal total = BigDecimal.ZERO; // inicializo

            for (Product product : products) {
                total = total.add(product.getPrice()); // sumo
            }

            return total;
        }

        public BigDecimal calculatePriceByType(ProductType type) {
            BigDecimal total = BigDecimal.ZERO;

            for (Product product : products) {
                if (product.getType() == type) {
                    total = total.add(product.getPrice()); // Suma el precio de los productos del tipo especificado
                }
            }

            return total;
        }

        public List<Product> getProductsByPriceAndType(BigDecimal precioMin, ProductType type) {
            return products.stream()
                    .filter(product -> product.getPrice().compareTo(precioMin) > 0)
                    .filter(product -> product.getType().equals(type))
                    /*convierto en lista*/
                    .collect(Collectors.toList());
        }




}
