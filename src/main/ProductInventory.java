package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductInventory {

    private final List<String> products = new ArrayList<>();

    public void addProduct(String product) {
        products.add(product);
    }
    public void removeProduct(String name) throws OutOfStockException {
        if (!products.remove(name)) {
            throw new OutOfStockException("Товару \"" + name + "\" немає в наявності!");
        }
    }

    public void sortProducts() {
        Collections.sort(products);
    }

    public List<String> getProducts() {
        return new ArrayList<>(products);
    }
}