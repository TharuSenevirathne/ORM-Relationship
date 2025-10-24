package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orders")

public class Order {
    //Owning side

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String orderDate;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

}
