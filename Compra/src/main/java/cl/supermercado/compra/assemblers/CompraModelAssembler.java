package cl.supermercado.compra.assemblers;

import cl.supermercado.compra.controller.CompraController;
import cl.supermercado.compra.dto.response.CompraResponseDto;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class CompraModelAssembler
        implements RepresentationModelAssembler<CompraResponseDto, EntityModel<CompraResponseDto>> {

    @Override
    public EntityModel<CompraResponseDto> toModel(CompraResponseDto dto) {
        return EntityModel.of(dto,
                linkTo(methodOn(CompraController.class).listarComprasPorUsuario(dto.getUsuarioId()))
                        .withSelfRel(),
                linkTo(methodOn(CompraController.class).listarComprasPorUsuario(dto.getUsuarioId()))
                        .withRel("historial-usuario")
        );
    }

}
