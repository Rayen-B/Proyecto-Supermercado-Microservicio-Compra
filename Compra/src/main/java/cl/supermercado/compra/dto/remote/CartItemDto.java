package cl.supermercado.compra.dto.remote;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter             @Setter
@AllArgsConstructor @NoArgsConstructor
public class CartItemDto {

    private Long id;
    private Long productId;
    private String productName;
    private Integer quantity;
    private Integer subtotal;

}
