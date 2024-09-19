package io.github.coacciFitec.com.example.controller;

import io.github.coacciFitec.com.example.model.Pessoa;
import io.github.coacciFitec.com.example.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
@Tag(name = "Pessoas", description = "Gerenciamento de pessoas")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public List<Pessoa> listarPessoas() {
        return pessoaService.listarTodas();
    }
}
