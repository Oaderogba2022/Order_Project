package ie.atu.orderserviceapplication;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long restaurantId; // ID of the restaurant from which the order is placed
    private Long customerId; // ID of the customer placing the order

    @ElementCollection
    @CollectionTable(name = "order_items", joinColumns = @JoinColumn(name = "order_id"))
    private List<OrderItem> items; // List of items in the order

    private double totalPrice;

    private String status; // e.g., "Pending", "Completed", "Cancelled"


}
