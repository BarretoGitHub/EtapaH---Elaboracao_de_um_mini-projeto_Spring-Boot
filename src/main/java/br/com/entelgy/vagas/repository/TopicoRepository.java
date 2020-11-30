package br.com.entelgy.vagas.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.entelgy.vagas.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

	Page<Topico> findByAreaAtuacao(String nomeAtuacao, Pageable paginacao);

}
