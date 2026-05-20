package cl.supermercado.Compra.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "compras")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Long usuarioId;

    @NotNull
    private Double total;

    private LocalDateTime fecha;

    @NotNull
    private Boolean pagoConfirmado;

    @NotNull
    private Boolean finalizada;
}