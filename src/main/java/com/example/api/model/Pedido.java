package com.example.api.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "pedidos")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String clienteNome;
    private double valorTotal;
}
