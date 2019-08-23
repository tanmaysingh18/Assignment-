
public class A1q4 {

	public static void main(String[] args) {
	int a=6;
	int b=9;
	int c=4;
	int d=2;
	int max;
	max=(a>b?a:b);
	max=(c>d?(c>max? c:max):(d>max?d:max));
	System.out.println(max);
	}

}
