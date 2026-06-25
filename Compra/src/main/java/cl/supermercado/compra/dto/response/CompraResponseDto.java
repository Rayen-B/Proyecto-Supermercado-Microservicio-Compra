package cl.supermercado.compra.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter             @Setter
@AllArgsConstructor @NoArgsConstructor
public class CompraResponseDto {

    private Long id;
    private Long usuarioId;
    private Double total;
    private LocalDateTime fechaCompra;
    private Boolean finalizada;
    private Boolean pagoConfirmado;

}