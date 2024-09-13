import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Main {

        public static void main(String[] args) {
            // cliente
            Customer john = new Customer("John", "Smith", LocalDate.of(1990, 1, 1), "john@example.com", "123456789", "ID12345");

            //productos
            Product p1 = new Product("Laptop", "Gaming laptop", BigDecimal.valueOf(1200.00), ProductType.ELECTRONIC);
            Product p2 = new Product("Smartphone", "Latest model", BigDecimal.valueOf(800.00), ProductType.ELECTRONIC);
            Product p3 = new Product("Tablet", "10 inch tablet", BigDecimal.valueOf(400.0), ProductType.ELECTRONIC);
            Product p4 = new Product("Headphones", "Noise cancelling", BigDecimal.valueOf(150.00), ProductType.ELECTRONIC);
            Product p5 = new Product("Harry Potter", "Fantasy book", BigDecimal.valueOf(30.00), ProductType.LIBRARY);
            Product p6 = new Product("Java Programming", "Educational book", BigDecimal.valueOf(120.00), ProductType.LIBRARY);
            Product p7 = new Product("1984", "Dystopian book", BigDecimal.valueOf(50.00), ProductType.LIBRARY);
            Product p8 = new Product("T-shirt", "Casual wear", BigDecimal.valueOf(12.00), ProductType.OTHERS);

            // carrito productos electrónicos
            ShoppingCart cart1 = new ShoppingCart(john);
            ShoppingCartPrinter printer = new ShoppingCartPrinter();
            cart1.addProduct(p1);
            cart1.addProduct(p2);
            cart1.addProduct(p3);
            cart1.addProduct(p4);

            // carrito de librería
            ShoppingCart cart2 = new ShoppingCart(john);
            cart2.addProduct(p5);
            cart2.addProduct(p6);
            cart2.addProduct(p7);

            // carrito  OTHERS
            ShoppingCart cart3 = new ShoppingCart(john);
            cart3.addProduct(p8);

            // subo carrito
            cart1.submit();

            // filtro precio > 100 y tipo LIBRARY
            BigDecimal precioMin = new BigDecimal("100");

            System.out.println("Productos tipo LIBRARY con precio mayor a 100:");
            List<Product> products = cart2.getProductsByPriceAndType(precioMin, ProductType.LIBRARY);

            for (Product product : products) {
                System.out.println(product);
            }


            System.out.println("Precio total de todos los productos en el carrito 1: " + cart1.calculateTotalPrice());


            System.out.println("Precio total de productos electrónicos en el carrito 1: " + cart1.calculatePriceByType(ProductType.ELECTRONIC));


            System.out.println("Productos ordenados por precio en el carrito 1:");
            printer.printProductsOrderedByPrice(cart1);
        }


}