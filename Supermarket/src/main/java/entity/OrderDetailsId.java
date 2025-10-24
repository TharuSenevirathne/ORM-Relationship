package entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Embeddable

public class OrderDetailsId {
//    @Column(name = "Order_id") meka methana dmmt wdk nh
    private String  orderId;

//    @Column(name = "Order_id") meka methana dmmt wdk nh
    private String ItemId;
}
