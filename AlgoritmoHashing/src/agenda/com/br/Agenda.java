package agenda.com.br;

public class Agenda {
	public static final String VAZIO = "*";
	public static final int FOLGA = 10;
	public static final int FATIAS = 27;
	public static final int MAX = FOLGA * FATIAS;
	private String dados[];

	public Agenda() {
		dados = new String[MAX];
		for (int i = 0; i < MAX; i++)
			dados[i] = VAZIO;
	}

	private int hash(String nome) {
		char c = Character.toLowerCase(nome.charAt(0));
		if (c >= 'a' && c <= 'z')
			return (c - 'a') * FOLGA;
		else
			return (FATIAS - 1) * FOLGA;
	}

	public int add(String nome) {
		int h = hash(nome);
		for (int i = h; i < h + FOLGA; i++)
			if (dados[i].equals(VAZIO)) {
				dados[i] = nome;
				return i;
			}
		return -1;
	}

	public int get(String nome) {
		int h = hash(nome);
		for (int i = h; i < h + FOLGA; i++)
			if (dados[i].equals(VAZIO))
				return -1;
			else if (dados[i].equals(nome))
				return i;
		return -1;
	}

	public String toString() {
		String resultado = "";
		for (int i = 0; i < MAX; i++)
			if (i % 10 == 0 || !dados[i].equals(VAZIO))
				resultado += String.format("%3d %s\n", i, dados[i]);
		return resultado;
	}
}