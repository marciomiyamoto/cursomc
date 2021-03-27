package com.marcio.cursomc.repositories;

import com.marcio.cursomc.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}
