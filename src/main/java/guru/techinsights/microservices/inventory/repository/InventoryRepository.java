package guru.techinsights.microservices.inventory.repository;

import guru.techinsights.microservices.inventory.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Sattya
 * create at 9/19/2024 2:22 AM
 */
public interface InventoryRepository extends JpaRepository<Inventory,Long> {
    boolean existsBySkuCodeIgnoreCaseAndQuantityGreaterThanEqual(String skuCode, Integer quantity);
}
