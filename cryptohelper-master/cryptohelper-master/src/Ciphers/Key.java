
import java.util.*;
public class Key {
	private int key [][];
	private int det;
	private int keyInverse [][];
	private int acceptedDet[] = {1,3,5,7,9,11,15,17,19,21,23,25};
	private Map<Integer, Integer> addInverse;
	private Map<Integer, Integer> multInverse;
	
	Key(){
		initAdd();
		initMult();
		key = new int[2][2];
		keyInverse = new int[2][2];
		initKey(key);
		initKeyInverse(key, keyInverse);
		
	}

	private void initKeyInverse(int[][] k, int[][] ki) {
		int detI = multInverse.get(det);
		ki[0][0] = k[1][1];
		ki[0][1] = addInverse.get(k[0][1]);
		ki[1][0] = addInverse.get(k[1][0]);
		ki[1][1] = k[0][0];
		
		ki[0][0] = (ki[0][0] * detI)% 26;
		ki[0][1] = (ki[0][1] * detI)% 26;
		ki[1][0] = (ki[1][0] * detI)% 26;
		ki[1][1] = (ki[1][1] * detI)% 26;
		
		
	}

	private void initKey(int[][] k) {
		Random rand = new Random();
		boolean dFlag = false;
		for(int i = 0; i < k.length; i++){
			for(int j =0; j <k[0].length; j++){
				k[i][j] = rand.nextInt(26);
			}
		}
		while(dFlag == false){
			det = getDet(k);
			for(int i = 0; i<acceptedDet.length; i++){
				if(det == acceptedDet[i]){
					dFlag = true;
				}
			}
			if (dFlag == false){
				for(int i = 0; i < k.length; i++){
					for(int j =0; j <k[0].length; j++){
						k[i][j] = rand.nextInt(26);
					}
				}
			}
		}
		
	}

	private int getDet(int[][] k) {
		int v, d;
		v = k[0][0]*k[1][1] - k[0][1]*k[1][0];
		d = Math.abs(v) % 26;
		return d;
	}

	private void initMult() {
		multInverse = new HashMap<Integer, Integer>();
		multInverse.put(1, 1);
		multInverse.put(3, 9);
		multInverse.put(5, 21);
		multInverse.put(7, 15);
		multInverse.put(9, 3);
		multInverse.put(11, 19);
		multInverse.put(15, 7);
		multInverse.put(17, 23);
		multInverse.put(19, 11);
		multInverse.put(21, 5);
		multInverse.put(23, 17);
		multInverse.put(25, 25);
	}

	private void initAdd() {
		addInverse = new HashMap<Integer, Integer>();
		addInverse.put(1, 25);
		addInverse.put(2, 24);
		addInverse.put(3, 23);
		addInverse.put(4, 22);
		addInverse.put(5, 21);
		addInverse.put(6, 20);
		addInverse.put(7, 19);
		addInverse.put(8, 18);
		addInverse.put(9, 17);
		addInverse.put(10, 16);
		addInverse.put(11, 15);
		addInverse.put(12, 14);
		addInverse.put(13, 13);
		addInverse.put(14, 12);
		addInverse.put(15, 11);
		addInverse.put(16, 10);
		addInverse.put(17, 9);
		addInverse.put(18, 8);
		addInverse.put(19, 7);
		addInverse.put(20, 6);
		addInverse.put(21, 5);
		addInverse.put(22, 4);
		addInverse.put(23, 3);
		addInverse.put(24, 2);
		addInverse.put(25, 1);
		addInverse.put(26, 26);
		
	}
	public int[][] getKey(){
		return key;
	}
	public int getDet(){
		return det;
	}
	public int[][] getKeyInverse(){
		return keyInverse;
	}
	public void printKey(){
		for(int i = 0 ; i < key.length; i++){
			for(int j =0 ; j < key[0].length; j++){
				System.out.print(key[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
	public void printKeyInverse(){
		for(int i = 0 ; i < keyInverse.length; i++){
			for(int j =0 ; j < keyInverse[0].length; j++){
				System.out.print(keyInverse[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
	
}
