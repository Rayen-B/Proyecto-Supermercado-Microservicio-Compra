package cl.supermercado.compra.controller;
import cl.supermercado.compra.dto.request.CompraRequestDto;
import cl.supermercado.compra.dto.response.CompraResponseDto;
import cl.supermercado.compra.model.Compra;
import cl.supermercado.compra.service.CompraService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/compras")
@RequiredArgsConstructor
public class CompraController {

    private final CompraService compraService;

    @PostMapping
    public ResponseEntity<CompraResponseDto> crearCompra(@Valid @RequestBody CompraRequestDto request) {
        return ResponseEntity.ok(compraService.crearCompra(request));
    }

    @GetMapping
    public ResponseEntity<List<CompraResponseDto>> listarCompras() {
        return ResponseEntity.ok(compraService.listarCompras());
    }

    @GetMapping("/usuario/{usuarioId}")
    public ResponseEntity<List<CompraResponseDto>> listarComprasPorUsuario(@PathVariable Long usuarioId) {
        return ResponseEntity.ok(compraService.listarComprasPorUsuario(usuarioId));
    }

}
