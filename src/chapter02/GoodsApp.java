package chapter02;

import mypackage.Goods;

public class GoodsApp {
	public static void main(String[] args) {
		Goods camera = new Goods();
		
		//public은 제한이 없음
		camera.name = "nikon";
		
		//protected는 같은 패키지 또는 자식 클래스에서만  가능
		//camera.price = 400000;
		
		//default는 같은 패키지에서만 접근 가능
		//camera.countStock = 30;
		//camera.countSold = 50;
		
		System.out.println(camera);;;;
		System.out.println("이름 : " + camera.name);
		//System.out.println("이름 : " + camera.name + ", 가격 : " + camera.price);
		camera.setCountSold(10);
		camera.showInfo();
		System.out.println("판매량 : " + camera.getCountSold());
		
		camera.setPrice(-10000);
	}
}
