package manutencaopc.service;

import manutencaopc.model.Tecnico;
import manutencaopc.repository.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TecnicoService {

    @Autowired
    private TecnicoRepository repository;

    public List<Tecnico> listarTodos() {
        return repository.findAll();
    }

    public Optional<Tecnico> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Tecnico salvar(Tecnico tecnico) {
        return repository.save(tecnico);
    }

    public Tecnico atualizar(Long id, Tecnico tecnico) {
        Tecnico existente = repository.findById(id).orElseThrow();
        tecnico.setId(id);
        return repository.save(tecnico);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}