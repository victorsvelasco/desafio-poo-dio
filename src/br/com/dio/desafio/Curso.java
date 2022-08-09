package br.com.dio.desafio;

public class Curso extends Conteudo{

	private int cargaHoraria;
	
	public Curso(String titulo, String descric�o, int cargaHoraria) {
		super(titulo, descric�o);
		
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public double calcularXp() {
		return XP_PADRAO * cargaHoraria;
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "Curso: titulo= " + getTitulo() 
				+ ", descric�o= " + getDescricao()
				+ ", cargaHoraria= " + cargaHoraria;
	}


	
	
	

}
