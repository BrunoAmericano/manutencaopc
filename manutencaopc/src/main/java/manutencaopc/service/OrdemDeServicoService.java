package manutencaopc.service;

import manutencaopc.model.OrdemDeServico;
import manutencaopc.repository.OrdemDeServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrdemDeServicoService {

    @Autowired
    private OrdemDeServicoRepository repository;

    public List<OrdemDeServico> listarTodos() {
        return repository.findAll();
    }

    public Optional<OrdemDeServico> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public OrdemDeServico salvar(OrdemDeServico ordem) {
        return repository.save(ordem);
    }

    public OrdemDeServico atualizar(Long id, OrdemDeServico novaOrdem) {
        OrdemDeServico existente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ordem não encontrada"));

        existente.setDescricao(novaOrdem.getDescricao());
        existente.setStatus(novaOrdem.getStatus());
        existente.setCliente(novaOrdem.getCliente());
        existente.setComputador(novaOrdem.getComputador());
        existente.setTecnico(novaOrdem.getTecnico());

        return repository.save(existente);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
