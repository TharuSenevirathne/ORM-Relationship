package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customer")

public class Customer {
    //inverse side

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String name;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
   // CascadeType.ALL = customer object ekak ekk order object ekak handle krnn puluwn
    List<Order> orders;
}
