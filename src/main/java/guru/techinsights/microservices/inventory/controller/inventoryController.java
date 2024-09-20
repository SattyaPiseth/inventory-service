package guru.techinsights.microservices.inventory.controller;

import guru.techinsights.microservices.inventory.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * @author Sattya
 * create at 9/19/2024 2:30 AM
 */
@RestController
@RequestMapping("api/inventory")
@RequiredArgsConstructor
public class inventoryController {
    private final InventoryService inventoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public boolean isInStock(@RequestParam String skuCode, @RequestParam Integer quantity){
        return inventoryService.isInStock(skuCode, quantity);
    }
}
