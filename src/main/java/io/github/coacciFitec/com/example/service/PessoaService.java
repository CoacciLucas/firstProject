package io.github.coacciFitec.com.example.service;

import io.github.coacciFitec.com.example.model.Pessoa;
import io.github.coacciFitec.com.example.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Pessoa> listarTodas() {
        return pessoaRepository.findAll();
    }
}
