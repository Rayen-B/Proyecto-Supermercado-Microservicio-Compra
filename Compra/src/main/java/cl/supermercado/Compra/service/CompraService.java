package cl.supermercado.Compra.service;
import cl.supermercado.Compra.model.Compra;
import java.util.List;

public interface CompraService {
    Compra crear(Compra compra);
    List<Compra> listar();
}
