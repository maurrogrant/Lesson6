import java.util.List;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct("Яблоки", 5);
        cart.addProduct("Бананы", 3);
        cart.addProduct("Груши", 2);

        System.out.println("\nСписок товаров в корзине:");
        List<String> products = cart.getProducts();
        for (String product : products) {
            System.out.println(product + ": " + cart.getProductQuantity(product) + " шт.");
        }

        cart.updateProductQuantity("Бананы", 4);
        System.out.println("\nОбновленный список товаров в корзине:");
        products = cart.getProducts();
        for (String product : products) {
            System.out.println(product + ": " + cart.getProductQuantity(product) + " шт.");
        }

        cart.removeProduct("Груши");
        System.out.println("\nСписок товаров после удаления груши:");
        products = cart.getProducts();
        for (String product : products) {
            System.out.println(product + ": " + cart.getProductQuantity(product) + " шт.");
        }

        cart.clear();
        System.out.println("\nКорзина после очистки:");
        products = cart.getProducts();
        System.out.println("Товары в корзине: " + products);
    }
}
