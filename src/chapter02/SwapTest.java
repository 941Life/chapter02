package chapter02;

public class SwapTest {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println( a + "," + b);
		swap(a,b);
		System.out.println( a + "," + b);
	
	//  Value 객체 생성 
		
		Value value1 = new Value();
		value1.v = 10;
		Value value2 = new Value();
		value2.v = 20;
		
		System.out.println(value1.v + "," + value2.v);
		swap(value1,value2);
		System.out.println(value1.v + "," + value2.v);
	}

	public static void swap(int v1, int v2){
		int temp = v1;
		v1 = v2;
		v2 = temp;
	}

	public static void swap(Value v1, Value v2){
		int temp = v1.v;
		v1.v = v2.v;
		v2.v = temp;
	}
}
