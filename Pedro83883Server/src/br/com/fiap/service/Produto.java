package br.com.fiap.service;

public class Produto {
	private String nome;
	private String desc;
	private String fabricante;
	private double valor;
	public Produto() {}
	public Produto(String nome, String desc, double valor, String fabricante) {
		this.nome = nome;
		this.desc = desc;
		this.valor = valor;
		this.fabricante = fabricante;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
}

