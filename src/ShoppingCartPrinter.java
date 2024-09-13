import java.util.List;

public class ShoppingCartPrinter {
    public void printProductsOrderedByPrice(ShoppingCart cart) {
        // Obtiene la lista de productos del carrito
        List<Product> products = cart.getProducts();

        // Imprime los productos ordenados por precio
        products.stream()
                .sorted((p1, p2) -> p1.getPrice().compareTo(p2.getPrice())) // Ordena por precio
                .forEach(System.out::println); // Imprime cada producto
    }
}
