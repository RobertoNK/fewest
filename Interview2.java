import java.util.Arrays;

public class Interview2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String arr [] = {"argentina", "peru", "chile","peru","argentina","cuba"};
		// write a method the only prints the countries that appear once
		String arr [] = {"argentina", "peru", "chile","peru","argentina","cuba"};
		less(arr);
	}
	public static void less(String arr[]) {
		int count[] = new int [arr.length];
		for(int i = 0; i<arr.length;i++) {
			for(int j = 0; j <arr.length;j++) 
			{
				if(arr[i]==arr[j])
				count[i]=count[i]+1;
			}
		}
		
		System.out.println("Countries that appear once in the array are: ");
		for(int i = 0; i<arr.length;i++) {
			if(count[i]==1) {
				
				System.out.print(arr[i]+ " ");
			}
		}
		
		
	}
}
