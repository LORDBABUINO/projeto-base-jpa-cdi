package com.stefanini.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "TB_ENDERECO")
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CO_SEQ_ENDERECO")
	private String id;

	@ManyToOne
	@JoinColumn(name = "CO_SEQ_PESSOA")
	private Pessoa pessoa;

	@NotNull
	@Column(name = "DS_LOGRADOURO")
	private String logradouro;

	@Column(name = "DS_COMPLEMENTO")
	private String complemento;

	@NotNull
	@Column(name = "DS_BAIRRO")
	private String bairro;

	@NotNull
	@Column(name = "DS_CIDADE")
	private String cidade;
	
	@NotNull
	@Column(name = "CO_UF")
	private String uf;
	
	@NotNull
	@Column(name = "DS_CEP")
	private String cep;

	public Endereco() {
	}

	public Endereco(Pessoa pessoa, String logradouro, String complemento, String bairro, String cidade, String uf,
			String cep) {
		super();
		this.pessoa = pessoa;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
	}

	public String getId() {
		return id;
	}

	public Pessoa getIdPessoa() {
		return pessoa;
	}

	public void setIdPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
}
