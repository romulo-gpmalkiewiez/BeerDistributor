package br.com.rgp.brewer.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Cerveja {

	@NotEmpty(message = "SKU é obrigatório")
	private String sku;
	
	@NotEmpty(message = "Nome é obrigatório")
	private String nome;
	
	@Size(max = 50, message = "A descrição deve ter no máximo 50 caracteres")
	private String descricao;

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
