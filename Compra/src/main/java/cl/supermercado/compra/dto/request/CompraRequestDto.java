package cl.supermercado.compra.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter             @Setter
@AllArgsConstructor @NoArgsConstructor
public class CompraRequestDto {

    @NotNull(message = "El id del usuario es obligatorio")
    private Long usuarioId;

}
