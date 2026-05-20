package cl.supermercado.Compra.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompraDTO {
    private Long id;
    private Long usuarioId;
    private Double total;
    private Boolean finalizada;
}