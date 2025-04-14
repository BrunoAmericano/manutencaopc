package manutencaopc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComputadorController {

    @GetMapping("/teste")
    public String teste() {
        return "API funcionando!";
    }
}
