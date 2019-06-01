package projectsPractice;

public class addingTwoArrays {
	public static void main(String[] args) {
		/**
		 * Write a method that will accept two array as parameters and return one new array
		 * will all values that have two arrays.
		 * 
		 * For Example: 
		 * first array: {"java", "code","fun","nine"}
		 * second array: {"hustle","until","get","a job"}
		 * -> return {"java", "code","fun","nine","hustle","until","get","a job"}
		 * 
		 * @param array of String
		 * @param array of String
		 * @return combined two arrays to one array
		 */
		
		String firstArray[]= new String []{"java", "code","fun","nine"};
		String secondArray[]= new String []{"hustle","until","get","a job"};
		String sum[]= new String [firstArray.length+secondArray.length];
		int count=0;
		for(int i=0; i<firstArray.length;i++) {
			sum[i]=firstArray[i];
			count++;
		}
		for(int j=0;j<secondArray.length;j++) {
			sum[count++]=secondArray[j];
		}
		for(int k=0; k<sum.length;k++) {
			System.out.print(sum[k]+" ");;
		}
		
	}

}
