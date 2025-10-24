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
@Table(name = "customer_table")

public class Customer {
    @Id

    private int id;

    @Column(name = "customer_name")
    private String name;

    private String email;
}
