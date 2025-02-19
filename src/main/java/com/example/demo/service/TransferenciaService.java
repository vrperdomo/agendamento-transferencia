package com.example.demo.service;

import com.example.demo.model.Transferencia;
import com.example.demo.repository.TransferenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransferenciaService {

    @Autowired
    private TransferenciaRepository repository;

    public void agendarTransferencia(Transferencia transferencia, double taxa) {
        transferencia.setValor(transferencia.getValor() + taxa);
        repository.save(transferencia);
    }

    public List<Transferencia> obterExtrato() {
        return repository.findAll();
    }

    public double calcularTaxa(int dias) {
        if (dias == 0) return 2.5;
        if (dias >= 1 && dias <= 10) return 0.0;
        if (dias >= 11 && dias <= 20) return 8.2;
        if (dias >= 21 && dias <= 30) return 6.9;
        if (dias >= 31 && dias <= 40) return 4.7;
        if (dias >= 41 && dias <= 50) return 1.7;
        return -1;
    }
}
