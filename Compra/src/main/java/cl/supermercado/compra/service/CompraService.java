package cl.supermercado.compra.service;
import cl.supermercado.compra.model.Compra;
import java.util.List;

public interface CompraService {
    Compra crear(Compra compra);
    List<Compra> listar();
}
