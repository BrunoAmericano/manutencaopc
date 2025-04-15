package manutencaopc.repository;

import manutencaopc.model.Computador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputadorRepository extends JpaRepository<Computador, Long> {
    // Aqui você pode adicionar métodos personalizados depois, se precisar
}
