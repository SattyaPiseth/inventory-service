package guru.techinsights.microservices.inventory.service;

/**
 * @author Sattya
 * create at 9/19/2024 2:23 AM
 */
public interface InventoryService {
    boolean isInStock(String skuCode, Integer quantity);
}
