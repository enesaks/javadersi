package javaders;

public class javadersclass {

	public static void main(String[] args) {
	
		int[]  array = {32,23,4,21,56,23,66,72,45,23};
		
		int j=9,temp;
		
		for(int i=0;i<array.length/2; i++) {
			temp =array[i];
			array[i]=array[j];
			array[j] = temp;
			j--;	
		}
		
		System.out.printf("%s%8s%n","Index","value");
		for(int counter =0; counter<array.length; counter++)
		{
			System.out.printf("%5d%8d%n",counter,array[counter]);
			
		}
		
	}

}
