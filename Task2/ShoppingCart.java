import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart implements Basket {
    private Map<String, Integer> products;

    public ShoppingCart() {
        products = new HashMap<>();
    }

    @Override
    public void addProduct(String product, int quantity) {
        if (quantity > 0) {
            products.put(product, products.getOrDefault(product, 0) + quantity);
            System.out.println("Добавлено " + quantity + " шт. товара: " + product);
        } else {
            System.out.println("Количество должно быть положительным.");
        }
    }

    @Override
    public void removeProduct(String product) {
        if (products.containsKey(product)) {
            products.remove(product);
            System.out.println("Товар " + product + " удален из корзины.");
        } else {
            System.out.println("Товар " + product + " не найден в корзине.");
        }
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        if (products.containsKey(product)) {
            if (quantity > 0) {
                products.put(product, quantity);
                System.out.println("Количество товара " + product + " обновлено до " + quantity + " шт.");
            } else {
                removeProduct(product);
            }
        } else {
            System.out.println("Товар " + product + " не найден в корзине.");
        }
    }

    @Override
    public void clear() {
        products.clear();
        System.out.println("Корзина очищена.");
    }

    @Override
    public List<String> getProducts() {
        return new ArrayList<>(products.keySet());
    }

    @Override
    public int getProductQuantity(String product) {
        return products.getOrDefault(product, 0);
    }
}
