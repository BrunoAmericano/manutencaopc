package manutencaopc.service;

import manutencaopc.model.Manutencao;
import manutencaopc.repository.ManutencaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ManutencaoService {

    @Autowired
    private ManutencaoRepository repository;

    public List<Manutencao> listarTodos() {
        return repository.findAll();
    }

    public Optional<Manutencao> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Manutencao salvar(Manutencao manutencao) {
        return repository.save(manutencao);
    }

    public Manutencao atualizar(Long id, Manutencao novaManutencao) {
        Manutencao existente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Manutenção não encontrada"));

        existente.setTipoServico(novaManutencao.getTipoServico());
        existente.setDescricao(novaManutencao.getDescricao());
        existente.setValor(novaManutencao.getValor());
        existente.setDataManutencao(novaManutencao.getDataManutencao());
        existente.setComputador(novaManutencao.getComputador());
        existente.setTecnico(novaManutencao.getTecnico());

        return repository.save(existente);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
