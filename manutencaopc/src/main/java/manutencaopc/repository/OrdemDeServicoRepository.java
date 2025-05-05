package manutencaopc.repository;

import manutencaopc.model.OrdemDeServico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdemDeServicoRepository extends JpaRepository<OrdemDeServico, Long> {
}
