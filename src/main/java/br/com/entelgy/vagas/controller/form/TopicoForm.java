package br.com.entelgy.vagas.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.com.entelgy.vagas.modelo.AreaAtuacao;
import br.com.entelgy.vagas.modelo.Topico;
import br.com.entelgy.vagas.repository.AreaAtuacaoRepository;

public class TopicoForm {

	@NotNull @NotEmpty @Length(min = 5)
	private String titulo;
	
	@NotNull @NotEmpty @Length(min = 10)
	private String mensagem;
	
	@NotNull @NotEmpty
	private String nomeArea;

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public void setNomeArea(String nomeArea) {
		this.nomeArea = nomeArea;
	}

	public Topico converter(AreaAtuacaoRepository areaAtuacaoRepository) {
		AreaAtuacao areaAtuacao = areaAtuacaoRepository.findByNome(nomeArea);
		return new Topico(titulo, mensagem, areaAtuacao);
	}

}
