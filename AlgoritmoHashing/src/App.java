import java.util.Hashtable;

public class App {

	Hashtable<String, Integer> numbers = new Hashtable<String, Integer>();

	public static void main(String[] args) {
		App app = new App();
		app.geraHash();
		
		String rec="one";
		
		System.out.println("Recupera: "+app.recupera(rec));
		
	}

	/**
	 * 
	 */
	public void geraHash() {
		numbers.put("one", 1);
		numbers.put("two", 2);
		numbers.put("three", 3);
	}

	/**
	 * 
	 * @param valor
	 * @return
	 */
	public int recupera(String valor) {
		Integer n = numbers.get(valor);
		if(n!=null){
			return n;
		}
		return -1;
	}
}
