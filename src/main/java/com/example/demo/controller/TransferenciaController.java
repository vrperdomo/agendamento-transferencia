package com.example.demo.controller;

import com.example.demo.model.Transferencia;
import com.example.demo.service.TransferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transferencias")
public class TransferenciaController {

    @Autowired
    private TransferenciaService service;

    @PostMapping("/agendar")
    public ResponseEntity<String> agendarTransferencia(@RequestBody Transferencia transferencia) {
        double taxa = service.calcularTaxa(transferencia.getDias());
        if (taxa < 0) {
            return ResponseEntity.badRequest().body("Erro: Nenhuma taxa aplicável.");
        }
        service.agendarTransferencia(transferencia, taxa);
        return ResponseEntity.ok("Transferência agendada com sucesso!");
    }

    @GetMapping("/extrato")
    public List<Transferencia> obterExtrato() {
        return service.obterExtrato();
    }
}
