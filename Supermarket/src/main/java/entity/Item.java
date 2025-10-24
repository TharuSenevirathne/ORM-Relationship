package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "item")

public class Item {
    @Id
    @Column(name = "item_id")
    private String id;

    @Column(length = 50) //length denn puluwn
    private String name;

    private int quantity;

    @Column(name = "unit_price",precision = 10, scale = 2)  // 100.00  ==  precision=100 wage dashama thithata kalin enn ona ilakkam gana , scale = dashama thithata passe enna ona ilakkam gana
    private BigDecimal unitprice;

    @OneToMany(mappedBy = "item")
    private List<OrderDetails> orderDetails;
}
