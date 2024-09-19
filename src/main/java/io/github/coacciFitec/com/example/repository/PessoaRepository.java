package io.github.coacciFitec.com.example.repository;

import io.github.coacciFitec.com.example.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
