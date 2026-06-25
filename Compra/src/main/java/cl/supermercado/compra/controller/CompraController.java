package cl.supermercado.compra.controller;
import cl.supermercado.compra.model.Compra;
import cl.supermercado.compra.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/compras")
public class CompraController {
    @Autowired
    private CompraService compraService;

    @PostMapping
    public ResponseEntity<CompraDTO> crear(@RequestBody Compra compra) {
        Compra nueva = compraService.crear(compra);
        CompraDTO dto = new CompraDTO(nueva.getId(), nueva.getUsuarioId(), nueva.getTotal(), nueva.getFinalizada());
        return ResponseEntity.ok(dto);
    }

    @GetMapping
    public ResponseEntity<List<CompraDTO>> listar() {
        List<CompraDTO> compras = compraService.listar()
                .stream()
                .map(c -> new CompraDTO(c.getId(), c.getUsuarioId(), c.getTotal(), c.getFinalizada()))
                .collect(Collectors.toList());
        return ResponseEntity.ok(compras);
    }
}
