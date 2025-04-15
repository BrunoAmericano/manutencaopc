package manutencaopc.service;

import manutencaopc.model.Computador;
import manutencaopc.repository.ComputadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComputadorService {

    @Autowired
    private ComputadorRepository repository;

    public List<Computador> listarTodos() {
        return repository.findAll();
    }

    public Optional<Computador> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Computador salvar(Computador computador) {
        return repository.save(computador);
    }

    public Computador atualizar(Long id, Computador computadorAtualizado) {
        return repository.findById(id).map(computador -> {
            computador.setMarca(computadorAtualizado.getMarca());
            computador.setModelo(computadorAtualizado.getModelo());
            computador.setSistemaOperacional(computadorAtualizado.getSistemaOperacional());
            computador.setEspecificacoes(computadorAtualizado.getEspecificacoes());
            return repository.save(computador);
        }).orElseThrow(() -> new RuntimeException("Computador não encontrado"));
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
