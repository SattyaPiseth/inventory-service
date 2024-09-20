package guru.techinsights.microservices.inventory.service.impl;

import guru.techinsights.microservices.inventory.repository.InventoryRepository;
import guru.techinsights.microservices.inventory.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Sattya
 * create at 9/19/2024 2:25 AM
 */
@Service
@RequiredArgsConstructor
public class InventoryServiceImpl implements InventoryService {
    private final InventoryRepository inventoryRepository;
    @Override
    public boolean isInStock(String skuCode, Integer quantity) {
        return inventoryRepository.existsBySkuCodeIgnoreCaseAndQuantityGreaterThanEqual(skuCode,quantity);
    }
}
