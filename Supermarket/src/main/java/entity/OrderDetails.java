package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Order_Detail")

public class OrderDetails {

    //    private int id;
    @EmbeddedId
    private OrderDetailsId orderDetailsId;

    @ManyToOne
    @MapsId("orderId")
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @MapsId("ItemId")
    @JoinColumn(name = "item_id")
    private Item item;

    private int qty;

    @Column(name = "unit_price" ,precision = 5 ,scale = 2)
    private BigDecimal unitPrice;
}
