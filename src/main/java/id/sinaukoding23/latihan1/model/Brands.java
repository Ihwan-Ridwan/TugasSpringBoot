package id.sinaukoding23.latihan1.model;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;

@Entity
@Table(name = "brands")
@Getter
@Setter
public class Brands {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer brandId;

    @Column
    private String brandName;
}