package manutencaopc.controller;

import manutencaopc.model.Computador;
import manutencaopc.service.ComputadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/computadores")
public class ComputadorController {

    @Autowired
    private ComputadorService service;

    @GetMapping
    public ResponseEntity<List<Computador>> listarTodos() {
        return ResponseEntity.ok(service.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Computador> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Computador> salvar(@RequestBody Computador computador) {
        return ResponseEntity.ok(service.salvar(computador));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Computador> atualizar(@PathVariable Long id, @RequestBody Computador computador) {
        try {
            return ResponseEntity.ok(service.atualizar(id, computador));
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
