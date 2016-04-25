public class HashMapHashFunctionApp {
	static int hash(int h) {
		// This function ensures that hashCodes that differ only by
		// constant multiples at each bit position have a bounded
		// number of collisions (approximately 8 at default load factor).
		h ^= (h >>> 20) ^ (h >>> 12);
		return h ^ (h >>> 7) ^ (h >>> 4);
	}

	public static void main(String[] args) {
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			int v = i;
			int hv = hash(i);
			if (v != hv) {
				System.out.printf("%08d %<08X  %08d %<08X\n", v, hv);
			}
		}
	}
}