package com.cibertec.examen.dawi_t1_panta_jefferson.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "farmaco")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Farmaco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdFarmaco", nullable = false)
    private int idFarmaco;
    @Column(name = "NomFarmaco")
    private String nomFarmaco;
    @Column(name = "Precio")
    private BigDecimal precio;
}
