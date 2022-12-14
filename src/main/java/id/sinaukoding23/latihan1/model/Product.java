package id.sinaukoding23.latihan1.model;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "products")
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer productId;

    @Column
    private String productName;

    @Column
    private Short modelYear;

    @Column(columnDefinition = "DECIMAL(10,2)")
    private BigDecimal listPrice;
}