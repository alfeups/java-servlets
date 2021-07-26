package br.com.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();

	public void adiciona(Empresa empresa) {
		// TODO Auto-generated method stub
		
	}
	
	public List<Empresa> getEmpresas (){
		return Banco.lista;
	}

}
