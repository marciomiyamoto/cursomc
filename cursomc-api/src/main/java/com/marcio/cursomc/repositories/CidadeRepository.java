package com.marcio.cursomc.repositories;

import com.marcio.cursomc.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
}
