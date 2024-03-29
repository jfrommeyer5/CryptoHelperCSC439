package Ciphers;

import java.awt.event.ActionEvent;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.ArrayList;

public class M94 extends BaseCipher{
	@SuppressWarnings("rawtypes")
	private static ArrayList<ArrayList> orderedKey = new ArrayList<ArrayList>();
	@SuppressWarnings("rawtypes")
	private static ArrayList<ArrayList> key = new ArrayList<ArrayList>();

	public M94() {
		super();
		initializeActionBtn("M-94");
	}

	/*
	 * Creates ArrayLists of the disks used in the M-94 cipher.
	 * Each ArrayList corresponds with the physical disks.
	 */
	private static void initDisks() {
		ArrayList<Character> B1 = new ArrayList<Character>();
		for(char c: "ABCEIGDJFVUYMHTQKZOLRXSPWN".toCharArray()) {
			B1.add(c);
		}
		orderedKey.add(B1);
		ArrayList<Character> C2 = new ArrayList<Character>();
		for(char c: "ACDEHFIJKTLMOUVYGZNPQXRWSB".toCharArray()) {
			C2.add(c);
		}
		orderedKey.add(C2);
		ArrayList<Character> D3 = new ArrayList<Character>();
		for(char c: "ADKOMJUBGEPHSCZINXFYQRTVWL".toCharArray()) {
			D3.add(c);
		}
		orderedKey.add(D3);
		ArrayList<Character> E4 = new ArrayList<Character>();
		for(char c: "AEDCBIFGJHLKMRUOQVPTNWYXZS".toCharArray()) {
			E4.add(c);
		}
		orderedKey.add(E4);
		ArrayList<Character> F5 = new ArrayList<Character>();
		for(char c: "AFNQUKDOPITJBRHCYSLWEMZVXG".toCharArray()) {
			F5.add(c);
		}
		orderedKey.add(F5);
		ArrayList<Character> G6 = new ArrayList<Character>();
		for(char c: "AGPOCIXLURNDYZHWBJSQFKVMET".toCharArray()) {
			G6.add(c);
		}
		orderedKey.add(G6);
		ArrayList<Character> H7 = new ArrayList<Character>();
		for(char c: "AHXJEZBNIKPVROGSYDULCFMQTW".toCharArray()) {
			H7.add(c);
		}
		orderedKey.add(H7);
		ArrayList<Character> I8 = new ArrayList<Character>();
		for(char c: "AIHPJOBWKCVFZLQERYNSUMGTDX".toCharArray()) {
			I8.add(c);
		}
		orderedKey.add(I8);
		ArrayList<Character> J9 = new ArrayList<Character>();
		for(char c: "AJDSKQOIVTZEFHGYUNLPMBXWCR".toCharArray()) {
			J9.add(c);
		}
		orderedKey.add(J9);
		ArrayList<Character> K10 = new ArrayList<Character>();
		for(char c: "AKELBDFJGHONMTPRQSVZUXYWIC".toCharArray()) {
			K10.add(c);
		}
		orderedKey.add(K10);
		ArrayList<Character> L11 = new ArrayList<Character>();
		for(char c: "ALTMSXVQPNOHUWDIZYCGKRFBEJ".toCharArray()) {
			L11.add(c);
		}
		orderedKey.add(L11);
		ArrayList<Character> M12 = new ArrayList<Character>();
		for(char c: "AMNFLHQGCUJTBYPZKXISRDVEWO".toCharArray()) {
			M12.add(c);
		}
		orderedKey.add(M12);
		ArrayList<Character> N13 = new ArrayList<Character>();
		for(char c: "ANCJILDHBMKGXUZTSWQYVORPFE".toCharArray()) {
			N13.add(c);
		}
		orderedKey.add(N13);
		ArrayList<Character> O14 = new ArrayList<Character>();
		for(char c: "AODWPKJVIUQHZCTXBLEGNYRSMF".toCharArray()) {
			O14.add(c);
		}
		orderedKey.add(O14);
		ArrayList<Character> P15 = new ArrayList<Character>();
		for(char c: "APBVHIYKSGUENTCXOWFQDRLJZM".toCharArray()) {
			P15.add(c);
		}
		orderedKey.add(P15);
		ArrayList<Character> Q16 = new ArrayList<Character>();
		for(char c: "AQJNUBTGIMWZRVLXCSHDEOKFPY".toCharArray()) {
			Q16.add(c);
		}
		orderedKey.add(Q16);
		ArrayList<Character> R17 = new ArrayList<Character>();
		for(char c: "ARMYOFTHEUSZJXDPCWGQIBKLNV".toCharArray()) {
			R17.add(c);
		}
		orderedKey.add(R17);
		ArrayList<Character> S18 = new ArrayList<Character>();
		for(char c: "ASDMCNEQBOZPLGVJRKYTFUIWXH".toCharArray()) {
			S18.add(c);
		}
		orderedKey.add(S18);
		ArrayList<Character> T19 = new ArrayList<Character>();
		for(char c: "ATOJYLFXNGWHVCMIRBSEKUPDZQ".toCharArray()) {
			T19.add(c);
		}
		orderedKey.add(T19);
		ArrayList<Character> U20 = new ArrayList<Character>();
		for(char c: "AUTRZXQLYIOVBPESNHJWMDGFCK".toCharArray()) {
			U20.add(c);
		}
		orderedKey.add(U20);
		ArrayList<Character> V21 = new ArrayList<Character>();
		for(char c: "AVNKHRGOXEYBFSJMUDQCLZWTIP".toCharArray()) {
			V21.add(c);
		}
		orderedKey.add(V21);
		ArrayList<Character> W22 = new ArrayList<Character>();
		for(char c: "AWVSFDLIEBHKNRJQZGMXPUCOTY".toCharArray()) {
			W22.add(c);
		}
		orderedKey.add(W22);
		ArrayList<Character> X23 = new ArrayList<Character>();
		for(char c: "AXKWREVDTUFOYHMLSIQNJCPGBZ".toCharArray()) {
			X23.add(c);
		}
		orderedKey.add(X23);
		ArrayList<Character> Y24 = new ArrayList<Character>();
		for(char c: "AYJPXMVKBQWUGLOSTECHNZFRID".toCharArray()) {
			Y24.add(c);
		}
		orderedKey.add(Y24);
		ArrayList<Character> Z25 = new ArrayList<Character>();
		for(char c: "AZDNBUHYFWJLVGRCQMPSOEXTKI".toCharArray()) {
			Z25.add(c);
		}
		orderedKey.add(Z25);
	}

	/*
	 * Sets the key to be the disks arranged in alphabetical order.
	 */
	private static void arrangeDisks() {
		key = orderedKey;
	}

	/*
	 * Orders the disks based on user input from an integer array.
	 * A disk can only be used 1 time.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void arrangeDisks(int[] arr) {
		if(arr != null) {
			key = (ArrayList<ArrayList>) orderedKey.clone();
			for(int i = 0; i < arr.length; i++)
				key.set(arr[i]-1, orderedKey.get(i));
		} else {
			arrangeDisks();
		}
	}

	/*
	 * Input a string and a line number.
	 * Encrypt the string.
	 * Output the line from the cipher of the encrypted message
	 */
	public static String encrypt(String msg, int line) {
		line = line%24+1;
		return encrypt(msg)[line];
	}

	/*
	 * Input a string.
	 * Encrypt with the M-94 cipher based on the arranged disks.
	 * Output an array of strings. Each string in the array is an encrypted line of the cipher
	 */
	public static String[] encrypt(String msg) {
		msg = msg.replaceAll("\\W", "");
		ArrayList<ArrayList<Character>> results = new ArrayList<ArrayList<Character>>();
		String[] response = new String[26];
		int counter = 0;
		int index = 0;
		int filler;

		if((filler = 25 - msg.length()%25) != 25 || msg.length() == 0)
			for(int i = 0; i < filler; i++)
				msg += 'A';

		CharacterIterator iter = new StringCharacterIterator(msg);

		for(int i = 0; i < msg.length()+1; i++)
			results.add(new ArrayList<Character>());

		while(iter.current() != CharacterIterator.DONE) {
			if(counter > 24) counter = 0;

			for(int i = 0; i < 26; i++)
				results.get(i).add(index, (char) key.get(counter).get((key.get(counter).indexOf(iter.current()) + i)%26));

			counter++;
			index++;

			iter.next();
		}

		for(int i = 0; i < response.length; i++) {
			StringBuilder sb = new StringBuilder();
			for(Character ch: results.get(i))
				sb.append(ch);
			response[i] = sb.toString();
		}

		return response;
	}

	@Override
	public void actionButtonActionPerformed(ActionEvent evt) {
		String input = getInputText().getText();
		String lines[] = input.split("\\r?\\n");
		String order = lines[0];
		input = lines[1].toUpperCase();

		initDisks();

		int arr[];
		if(order.length() == 0) {
			arr = null;
		} else {
			String[] items = order.split("\\s");
			arr = new int[items.length];

			for(int i = 0; i < items.length; i++)
				arr[i] = Integer.parseInt(items[i]);
		}

		arrangeDisks(arr);

		getMainCipherTextArea().setText("");

		String[] m94 = encrypt(input);

		for(int i = 0; i < m94.length; i++) {
			m94[i] = standardize(m94[i], input);
			getMainCipherTextArea().append(m94[i]);
			getMainCipherTextArea().append("\n");
		}
		/*
		 * 25 1 24 2 23 3 22 4 21 5 20 6 19 7 18 8 17 9 16 10 15 11 14 12 13
		 * JQDJB VBHFS LLZJ PBN MX. EAAIP RCHTE VBW LXN PPKT. DNDAG PBMSI VDH WOCWUI JXP BONF EQM.
		 */
	}

	private String standardize(String string, String input) {
		char[] in = input.toCharArray();
		String output;
		ArrayList<Character> outputArr = new ArrayList<Character>();
		for(char c: string.toCharArray())
			outputArr.add(c);

		for(int i = 0; i < input.length(); i++)
			if(!(in[i] >= 'A' && in[i] <= 'Z'))
				outputArr.add(i, in[i]);
		
		outputArr.add(input.length(), " ".toCharArray()[0]);

		StringBuilder sb = new StringBuilder();
		for(Character ch: outputArr)
			sb.append(ch);
		output = sb.toString();

		return output;
	}
}