
public class Deslocamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 1234567890; // 01001001100101100000001011010010 em binário
//		int b = 987654321;  // 00111010110111100110100010110001 em binário
//		 
//		int and = a & b; // 00001000100101100000000010010000
//		int or  = a | b; // 01111011110111100110101011110011
//		int xor = a ^ b; // 01110011010010000110101001100011
//		int not = ~a;    // 10110110011010011111110100101101
//		 
//		System.out.print("a -> ");       
//		System.out.println(Integer.toBinaryString(a)); // imprime a representação binária do número
//		System.out.print("b -> ");
//		System.out.println(Integer.toBinaryString(b));
//		
//		System.out.print("-----------------------------------------\n");
//		
//		System.out.print("a & b -> ");
//		System.out.println(Integer.toBinaryString(and));
//		System.out.print("a | b -> ");
//		System.out.println(Integer.toBinaryString(or));
//		System.out.print("a ^ b -> ");
//		System.out.println(Integer.toBinaryString(xor));
//		System.out.print("~a -> ");
//		System.out.println(Integer.toBinaryString(not));

		
		
		System.out.print("-----------------------------------------\n");
		
		int a = 1431655765;  // 01010101010101010101010101010101
		int b = -1431655766; // 10101010101010101010101010101010
		 
		System.out.print("a -> ");
		System.out.println(Integer.toBinaryString(a)); // imprime a representação binária do número
		System.out.print("b -> ");
		System.out.println(Integer.toBinaryString(b));
		 
		System.out.print("a << 3 -> ");
		System.out.println(Integer.toBinaryString(a << 3)); // 10101010101010101010101010101000
		System.out.print("b << 3 -> ");
		System.out.println(Integer.toBinaryString(b << 3)); // 01010101010101010101010101010000
		 
		System.out.print("a >>> 3 -> ");
		System.out.println(Integer.toBinaryString(a >>> 3)); // 00001010101010101010101010101010
		System.out.print("b >>> 3 -> ");
		System.out.println(Integer.toBinaryString(b >>> 3)); // 00010101010101010101010101010101
		 
		System.out.print("a >> 3 -> ");
		System.out.println(Integer.toBinaryString(a >> 3)); // 00001010101010101010101010101010
		System.out.print("b >> 3 -> ");
		System.out.println(Integer.toBinaryString(b >> 3)); // 11110101010101010101010101010101

		
		
	}

}
