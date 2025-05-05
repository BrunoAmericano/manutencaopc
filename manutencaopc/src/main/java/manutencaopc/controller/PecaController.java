package manutencaopc.controller;

import manutencaopc.model.Peca;
import manutencaopc.service.PecaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pecas")
public class PecaController {

    @Autowired
    private PecaService service;

    @GetMapping
    public ResponseEntity<List<Peca>> listarTodas() {
        return ResponseEntity.ok(service.listarTodas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Peca> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Peca> salvar(@RequestBody Peca peca) {
        return ResponseEntity.ok(service.salvar(peca));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Peca> atualizar(@PathVariable Long id, @RequestBody Peca peca) {
        try {
            return ResponseEntity.ok(service.atualizar(id, peca));
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

