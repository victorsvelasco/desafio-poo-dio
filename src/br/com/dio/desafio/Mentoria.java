package br.com.dio.desafio;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Mentoria extends Conteudo{
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Date data;

	public Mentoria(String titulo, String descricão, Date data) {
		super(titulo, descricão);
		this.data = data;
	}

	@Override
	public double calcularXp() {
		return XP_PADRAO + 20d;
	}
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Mentoria titulo= " + getTitulo() 
				+ ", descricão= " + getDescricao() 
				+ ", data= " + sdf.format(data);
	}

	
}
