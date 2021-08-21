package com.example.demo.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Table(name = "TB_LIVROS")
@Entity
public class LivroModels {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String autor;
	private String editora;
	private String edicao;
	private String idioma;
	private Integer quantidadePaginas;
	@Column(columnDefinition = "TEXT") /* Permite inserir mais caracteres no banco */
	private String sobre;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getEdicao() {
		return edicao;
	}
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public Integer getQuantidadePaginas() {
		return quantidadePaginas;
	}
	public void setQuantidadePaginas(Integer quantidadePaginas) {
		this.quantidadePaginas = quantidadePaginas;
	}
	public String getSobre() {
		return sobre;
	}
	public void setSobre(String sobre) {
		this.sobre = sobre;
	}
	@Override
	public int hashCode() {
		return Objects.hash(autor, edicao, editora, id, idioma, nome, quantidadePaginas, sobre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LivroModels other = (LivroModels) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(edicao, other.edicao)
				&& Objects.equals(editora, other.editora) && Objects.equals(id, other.id)
				&& Objects.equals(idioma, other.idioma) && Objects.equals(nome, other.nome)
				&& Objects.equals(quantidadePaginas, other.quantidadePaginas) && Objects.equals(sobre, other.sobre);
	}
	@Override
	public String toString() {
		return "LivroModels [id=" + id + ", nome=" + nome + ", autor=" + autor + ", editora=" + editora + ", edicao="
				+ edicao + ", idioma=" + idioma + ", quantidadePaginas=" + quantidadePaginas + ", sobre=" + sobre
				+ ", getId()=" + getId() + ", getNome()=" + getNome() + ", getAutor()=" + getAutor() + ", getEditora()="
				+ getEditora() + ", getEdicao()=" + getEdicao() + ", getIdioma()=" + getIdioma()
				+ ", getQuantidadePaginas()=" + getQuantidadePaginas() + ", getSobre()=" + getSobre() + ", hashCode()="
				+ hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}
	

}
