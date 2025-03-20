public class Program1 {
    public static void main (String[] args) {
        int a=10,b=20,temp;
        System.out.println("a: "+a+" b: "+b);
        a=a+b;
		b=a-b;
		a=a-b;
        System.out.println("a: "+a+" b: "+b);
    }
}