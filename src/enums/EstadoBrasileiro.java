package enums;

public enum EstadoBrasileiro {

	ACRE("Acre", "Rio Branco", "AC", 12, "Norte"), ALAGOAS("Alagoas", "Maceió", "AL", 27, "Nordeste"),
	AMAPÁ("Amapá", "Macapá", "AP", 16, "Norte"), AMAZONAS("Amazonas", "Manaus", "AM", 13, "Norte"),
	BAHIA("Bahia", "Salvador", "BA", 29, "Nordeste"), CEARA("Ceará", "Fortaleza", "CE", 23, "Nordeste"),
	DISTRITO_FEDERAL("Distrito Federal", "Brasília", "DF", 53, "Centro-Oeste"),
	ESPIRITO_SANTO("Espírito Santo", "Vitória", "ES", 32, "Sudeste"),
	GOIAS("Goiás", "Goiânia", "GO", 52, "Centro-Oeste"), MARANHAO("Maranhão", "São Luís", "MA", 21, "Nordeste"),
	MATO_GROSSO("Mato Grosso", "Cuiabá", "MT", 51, "Centro-Oeste"),
	MATO_GROSSO_DO_SUL("Mato Grosso do Sul", "Campo Grande", "MS", 50, "Centro-Oeste"),
	MINAS_GERAIS("Minas Gerais", "Belo Horizonte", "MG", 31, "Sudeste"), PARA("Pará", "Belém", "PA", 15, "Norte"),
	PARAIBA("Paraíba", "João Pessoa", "PB", 25, "Nordeste"), PERNAMBUCO("Pernambuco", "Recife", "PE", 26, "Nordeste"),
	PIAUI("Piauí", "Teresina", "PI", 22, "Nordeste"),
	RIO_DE_JANEIRO("Rio de Janeiro", "Rio de Janeiro", "RJ", 33, "Sudeste"),
	RIO_GRANDE_DO_NORTE("Rio Grande do Norte", "Natal", "RN", 24, "Nordeste"),
	RIO_GRANDE_DO_SUL("Rio Grande do Sul", "Porto Alegre", "RS", 43, "Sul"),
	RONDONIA("Rondônia", "Porto Velho", "RO", 11, "Norte"), RORAIMA("Roraima", "Boa Vista", "RR", 14, "Norte"),
	SANTA_CATARINA("Santa Catarina", "Florianópolis", "SC", 42, "Sul"),
	SAO_PAULO("São Paulo", "São Paulo", "SP", 35, "Sudeste"), SERGIPE("Sergipe", "Aracaju", "SE", 28, "Nordeste"),
	TOCANTINS("Tocantins", "Palmas", "TO", 17, "Norte");

	private String nome;
	private String capital;
	private String sigla;
	private int codigoIBGE;
	private String regiao;

	private EstadoBrasileiro(String nome, String capital, String sigla, int codigoIBGE, String regiao) {
		this.nome = nome;
		this.capital = capital;
		this.sigla = sigla;
		this.codigoIBGE = codigoIBGE;
		this.regiao = regiao;
	}

	public static EstadoBrasileiro procurarEstadoPelaSigla(String estadoSigla) throws IllegalArgumentException {
		for (EstadoBrasileiro estado : EstadoBrasileiro.values()) {
			if (estadoSigla.compareToIgnoreCase(estado.getSigla()) == 0) {
				return estado;
			}
		}
		throw new IllegalArgumentException("Sigla de estado inválida! Tente novamente!");
	}

	@Override
	public String toString() {
		return "EstadoBrasileiro{nome='" + this.nome + "', capital='" + this.capital + "', sigla='" + this.sigla
				+ "', codigoIBGE=" + this.codigoIBGE + ", regiao='" + this.regiao + "'}";
	}

	public String getNome() {
		return this.nome;
	}

	public String getCapital() {
		return this.capital;
	}

	public String getSigla() {
		return this.sigla;
	}

	public int getCodigoIBGE() {
		return this.codigoIBGE;
	}

	public String getRegiao() {
		return this.regiao;
	}

}