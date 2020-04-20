package br.com.fiap.service;

import java.util.ArrayList;
import java.util.List;

public class produtoService {
	static List<Produto> list = new ArrayList<Produto>();
	
	public int Cadastrar(String nome, String desc, double valor, String fabricante) {
		try {
			Produto p = new Produto(nome, desc, valor, fabricante);
			list.add(p);
			return 1;
		}catch(Exception e) {
			return 0;
		}
	}
	
	public int Atualizar(int index, String nome, String desc, double valor, String fabricante) {
		try {
			Produto p = new Produto();
			p = new Produto(nome, desc, valor, fabricante);
			list.set(index, p);
			return 1;
		}catch(Exception e) {
			return 0;
		}
	}
	public int Remover(int index) {
		try {
			list.remove(index);
			return 1;
		}catch(Exception e) {
			return 0;
		}
	}
	public List<Produto> Listar(){
		return list;
	}
}
