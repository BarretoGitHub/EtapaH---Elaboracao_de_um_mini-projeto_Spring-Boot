package br.com.entelgy.vagas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.entelgy.vagas.modelo.AreaAtuacao;

public interface AreaAtuacaoRepository extends JpaRepository<AreaAtuacao, Long> {

	AreaAtuacao findByNome(String nome);

}
