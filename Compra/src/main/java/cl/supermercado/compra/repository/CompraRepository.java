package cl.supermercado.compra.repository;
import cl.supermercado.compra.model.Compra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompraRepository extends JpaRepository<Compra, Long> {
}