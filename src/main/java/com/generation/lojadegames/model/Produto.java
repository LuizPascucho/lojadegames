package com.generation.lojadegames.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


	@Entity
	@Table(name = "tb_produto")
	public class Produto {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY) 
		private long id;
		
		@NotBlank(message = "O atributo Nome é Obrigatório")
		@Size(min = 5, max = 100, message = "Tamanho mínimo: 5, maximo: 100")
		private String nome;
		
		@NotBlank(message = "O atributo Descrição é Obrigatório")
		@Size(min = 10, max = 1000, message = "Tamanho mínimo: 10, maximo: 1000")
		private String descricao;
		
		@NotBlank(message = "O atributo Console é Obrigatório")
		@Size(min = 10, max = 100, message = "Tamanho mínimo: 10, maximo: 100")
		private String console;
		
		@NotBlank(message = "O atributo Quantidade é Obrigatório")
		private int quantidade;
		
		@NotBlank(message = "O atributo preço é Obrigatório")
		@Column(precision = 8, scale = 2) 
		private BigDecimal preco;
		
		@NotBlank(message = "O atributo foto é Obrigatório")
		private String foto;

		@ManyToOne
		@JsonIgnoreProperties("produto")
		private Categoria categoria;
		
		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
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

		public String getConsole() {
			return console;
		}

		public void setConsole(String console) {
			this.console = console;
		}

		public int getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}

		public BigDecimal getPreco() {
			return preco;
		}

		public void setPreco(BigDecimal preco) {
			this.preco = preco;
		}

		public String getFoto() {
			return foto;
		}

		public void setFoto(String foto) {
			this.foto = foto;
		}

		public Categoria getCategoria() {
			return categoria;
		}

		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}

		
}
