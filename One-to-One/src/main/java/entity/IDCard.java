package entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "nic_details")

public class IDCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String nic;

    @OneToOne(mappedBy = "idCard")//mappedBy ekt denne ehapaththe thiyn inn reference eka foreign key eka denne IDCard, foreign key eka laga thiygnne Customer)
    private Customer customer;

}
