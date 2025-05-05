package manutencaopc.service;

import manutencaopc.model.Peca;
import manutencaopc.repository.PecaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PecaService {
    @Autowired
    private PecaRepository repository;

    public List<Peca> listarTodas() {
        return repository.findAll();
    }

    public Optional<Peca> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Peca salvar(Peca peca) {
        return repository.save(peca);
    }

    public Peca atualizar(Long id, Peca pecaAtualizada) {
        Peca peca = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Peça não encontrada"));
        peca.setNome(pecaAtualizada.getNome());
        peca.setFabricante(pecaAtualizada.getFabricante());
        peca.setPreco(pecaAtualizada.getPreco());
        return repository.save(peca);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
