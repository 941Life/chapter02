package mypackage;

   //          클래스 헤더               //
public class Goods {
	//         필드 정의               //
	public final static float DISCOUNT_REATE = 0.2f;
	public static int countOfGoods;
	
	//- 값이 들어가지 않도록 메소드에서 보호
	public void setPrice(int price){
		if(price < 0){
			price = 0 ;
		}
		
		this.price=price;
	}
	
	
	public String name; 	 //public 
	protected int price; 	//protected (같은 패키지 + 자식)
	int countStock;			//default (같은 패키지)
	private int countSold;	//한 클래스 내부에서만
	
	public Goods(){ //생성자를 만들지 않으면 기본적으로 parameter가 없는 기본생성자를 만들어 준다. 
		Goods.countOfGoods++;
	}
	
	public void setCountSold(int countSold){
		this.countSold = countSold;
	}
	
	public int getCountSold(){
		return countSold;
	}
	
	public void showInfo(){
		System.out.println("이름 :" + name + ", 가격 : " + price + ", 재고량 : " + countStock + ", 판매량 : " + countSold );
	}
	
	public int calcDiscountPrice(int percentage){
		int discountPrice = price*percentage/100;
		return discountPrice;
	}
	
	
//	String name;
//	int price;
//	int countStock;
//	int countSold;
}
