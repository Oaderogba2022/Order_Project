package ie.atu.orderserviceapplication;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {
    private String itemName;
    private int quantity;
    private double price;
}
