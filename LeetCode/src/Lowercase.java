
public class Lowercase {

	public static void main(String[] args) {
		String output = new Lowercase().toLowerCase("Hello");
		System.out.println(output);
	}
	
	public String toLowerCase(String str) {
		char a[] = str.toCharArray();
		for(int i=0;i<a.length;i++){
			if(a[i]>=65 && a[i]<=90){
				a[i]+=32;
			}
		}
		return String.valueOf(a);
    }

}
