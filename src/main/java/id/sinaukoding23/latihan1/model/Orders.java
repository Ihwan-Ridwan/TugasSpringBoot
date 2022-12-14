package id.sinaukoding23.latihan1.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "orders")
@Getter
@Setter
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private Integer orderId;

    @Column
    private Integer customerId;

    @Column
    private Byte orderStatus;

    @Column
    private java.sql.Date orderDate;

    @Column
    private java.sql.Date requiredDate;

    @Column
    private java.sql.Date  shippedDate;
}