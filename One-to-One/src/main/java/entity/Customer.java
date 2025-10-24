package entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customer")

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //AUTO = hibernate decided auto value
    //IDENTITY = database generate auto value
    //IDENTITY hri AUTO hri denw nan aniwaren id eka int wenn one
    //keyboard input deddi me @GeneratedValue denn epa.


    private int id;
    private String name;

    @OneToOne
    @JoinColumn(name = "nic_number") //Column names change krnne meken
    private IDCard idCard;
}
