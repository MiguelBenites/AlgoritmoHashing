import java.util.Hashtable;

public class HashTable {

	Hashtable<Integer, Integer> numbers = new Hashtable<Integer, Integer>();

	public static void main(String[] args) {
		
		HashTable h = new HashTable();
		
		/*
		Mostre como ficará o conteúdo do vetor da hash de
		tamanho 20, inicialmente vazio, após a inserção de
		cada um dos seguintes elementos 25, 44, 3, 32, 29,
		8, 23, 64, 1, 19, assumindo que a implementação da
		hash é endereçamento aberto. 
		*/
		
		//elementos 25, 44, 3, 32, 29, 8, 23, 64, 1, 19
		h.put(25);
		h.put(44);
		h.put(3);
		h.put(32);
		h.put(29);
     	h.put(8);
		h.put(23);
		h.put(64);
		h.put(1);
		h.put(19);
		
		System.out.println(h.numbers.entrySet());
		
		//Saídas....
		//[44, 19, 64, 32, 8, 29, 3, 25, 1, 23]
		//[10,  2,  0,  0, 0, 17, 2,  7, 7, 12]
	
		
	}

	public void put(int key) {
		int hkey;
		hkey = ((key * 7) + (key / 2)) % 20;
		
		if (!numbers.containsValue(hkey)){
			numbers.put(key, hkey);
		}else{
			hkey = hkey +1;			
			while(numbers.containsValue(hkey) == true){
				hkey = hkey +1;
			}
			numbers.put(key, hkey);
		}		
		System.out.println("key: "+key+" Chave: "+hkey);
	}

}
