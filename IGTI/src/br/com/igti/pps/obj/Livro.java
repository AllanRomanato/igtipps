package br.com.igti.pps.obj;

import java.util.Date;
/**
 * 
 * @author vinicius
 *
 */

/*Classe com padrão criação criacional BUILDER*/
public class Livro {
	
	//atributos obrigatorios
	private Long ISSBN;
	
	//atributos opcionais
	private Date dataPublicacao;
	private String categoria;
	private String editora;
	
	private Livro(LivroBuilder builder){
		
	}

	public static class LivroBuilder{
		private Long ISSBN;
		private String nome;
		private String autor;
		private Date dataPublicacao;
		private String categoria;
		private String editora;
		
		public LivroBuilder(Long ISSBN, String nome, String autor){
			this.ISSBN = ISSBN;
			this.nome = nome;
			this.autor = autor;
		}
		
		public LivroBuilder dataPublicacao(Date dataPublicacao){
			this.dataPublicacao = dataPublicacao;
			return this;
		}
		
		public LivroBuilder categoria(String categoria){
			this.categoria = categoria;
			return this;
		}
		
		public LivroBuilder editoria(String editora){
			this.editora = editora;
			return this;
		}
		
		public Livro build(){
			return new Livro(this);
		}
	}
}