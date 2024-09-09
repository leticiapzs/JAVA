package br.com.banco.enums;

public enum TipoUsuarioEnum {

	GERENTE_REGIONAL("Gerente Regional", 1),
	DIRETOR("Diretor", 2),
	PRESIDENTE("Presidente", 3),
	CLIENTE("Cliente", 4),
	OPERADOR_CAIXA("Operador de Caixa", 5);

	private String tipo;
	private int codigo;
	
	TipoUsuarioEnum(String tipo, int codigo) {
		this.tipo = tipo;
		this.codigo = codigo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
}
