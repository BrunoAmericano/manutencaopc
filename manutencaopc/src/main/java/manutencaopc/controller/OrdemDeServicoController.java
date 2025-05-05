package manutencaopc.controller;

import manutencaopc.model.OrdemDeServico;
import manutencaopc.service.OrdemDeServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ordens")
public class OrdemDeServicoController {

    @Autowired
    private OrdemDeServicoService service;

    @GetMapping
    public ResponseEntity<List<OrdemDeServico>> listarTodos() {
        return ResponseEntity.ok(service.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrdemDeServico> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<OrdemDeServico> salvar(@RequestBody OrdemDeServico ordem) {
        return ResponseEntity.ok(service.salvar(ordem));
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrdemDeServico> atualizar(@PathVariable Long id, @RequestBody OrdemDeServico ordem) {
        try {
            return ResponseEntity.ok(service.atualizar(id, ordem));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
