package week1day1;

public class FIbonacciSeries {

	public static void main(String[] args) {
	int n1=0,n2=1,n3,c=8;
	System.out.println(n1+"\n"+n2);
	for(int i=1;i<=c;i++)
	{
		n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.println(n3);
	}

	}

}
