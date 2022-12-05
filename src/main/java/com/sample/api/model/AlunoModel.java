package com.sample.api.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sample.api.enums.TipoCursoEnum;
import com.sample.api.enums.TipoGeneroEnum;
import com.sample.api.enums.TipoNomeCursoEnum;
import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_aluno", schema = "bd_api_sample")
public class AlunoModel implements Serializable {
	
	private static final long serialVersionUID = 1L;
		
	@Id
	@Column(name="id")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Column(name="nome")
	private String nome;
	
	@NotNull
	@Column(name="cpf")
	private String cpf;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(name="curso")
	private TipoNomeCursoEnum tipoNomeCurso;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_cusro")
	private TipoCursoEnum tipoCurso;

	@Column(name="data_cadastro")
	private Date dataCadastro;
	
	@Column(name="data_alteracao")
	private Date dataAlteracao;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_genero")
	private TipoGeneroEnum tipoGenero;
	
	
	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Date getDataAlteracao() {
		return dataAlteracao;
	}

	public void setDataAlteracao(Date dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public TipoNomeCursoEnum getTipoCursoEnum() {
		return tipoNomeCurso;
	}

	public void setTipoCursoEnum(TipoNomeCursoEnum tipoNomeCurso) {
		this.tipoNomeCurso = tipoNomeCurso;
	}

	public TipoGeneroEnum getTipoGenero() {
		return tipoGenero;
	}

	public void setTipoGenero(TipoGeneroEnum tipoGenero) {
		this.tipoGenero = tipoGenero;
	}

	public TipoCursoEnum getTipoCurso() {
		return tipoCurso;
	}

	public void setTipoCurso(TipoCursoEnum tipoCurso) {
		this.tipoCurso = tipoCurso;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
