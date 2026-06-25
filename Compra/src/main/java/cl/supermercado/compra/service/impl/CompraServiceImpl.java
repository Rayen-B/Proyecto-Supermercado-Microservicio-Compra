package cl.supermercado.compra.service.impl;


import cl.supermercado.compra.model.Compra;
import cl.supermercado.compra.repository.CompraRepository;
import cl.supermercado.compra.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CompraServiceImpl implements CompraService {
    @Autowired
    private CompraRepository compraRepository;

    @Override
    public Compra crear(Compra compra) {
        // Regla: solo se procesa si el pago fue confirmado
        if (Boolean.TRUE.equals(compra.getPagoConfirmado())) {
            compra.setFecha(LocalDateTime.now());
            compra.setFinalizada(true);
            return compraRepository.save(compra);
        } else {
            throw new IllegalStateException("Pago no confirmado, la compra no puede procesarse.");
        }
    }

    @Override
    public List<Compra> listar() {
        return compraRepository.findAll();
    }
}