package com.stefanini.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "TB_PERFIL")
public class Perfil {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CO_SEQ_PERFIL")
	private Long id;

	@NotNull
	@Column(name = "NO_PERFIL")
	private String name;

	@Column(name = "DS_PERFIL")
	private String descricao;

	@Column(name = "DT_HORA_INCLUSAO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date horaInclusao;

	@NotNull
	@Column(name = "DT_HORA_ALTERACAO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date horaAlteracao;

	public Perfil () {}
	public Perfil(
		@NotNull String name,
		String descricao,
		Date horaInclusao,
		Date horaAlteracao
	) {
		this.name = name;
		this.descricao = descricao;
		this.horaInclusao = horaInclusao;
		this.horaAlteracao = horaAlteracao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getHoraInclusao() {
		return horaInclusao;
	}
	public Date getHoraAlteracao() {
		return horaAlteracao;
	}

	@Override
	public String toString() {
		return "Perfil [id=" + id
				+ ", nome=" + name +
				", descricao=" + descricao +
				", horaInclusao=" + horaInclusao +
				", horaAlteracao=" + horaAlteracao + "]";
	}
}
