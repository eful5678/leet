package selection;

public class Selection01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, j;
		int temp = 0;
		int index = 0;
		int min = 0;
		
		int[] Array = {1, 10, 5, 8 ,7, 6, 4, 3, 2, 9};
		
		for(i = 0; i < 10; i++) {
			min = 100;
			for(j = 0; j < 10; j++) {
				if(min > Array[j]) {
					min = Array[j];
					index = j;
				}
			}
			temp = Array[i];
			Array[i] = Array[index];
			Array[index] = temp;
		}

	}

}
