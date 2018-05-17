 package a;

import java.util.Random;

//usando bucles anidados
public class b {
public static void main(String[] args) {
	int [] [] matrix = new int  [4][5];
	
	for (int i = 0; i< 4; i++){
		for (int j = 0; j< 5 ; j++){
		matrix [i][j] = new Random().nextInt(100);
		}
	}
	
	for (int i = 0; i< 4; i++){
		for (int j = 0; j < 5; j++) {
			System.out.println("valor en: (" + i + "," + j + ") -> " + matrix [i][j]);
		}
	}
}

}
