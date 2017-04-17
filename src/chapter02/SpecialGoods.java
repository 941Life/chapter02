package chapter02;

import mypackage.Goods;

public class SpecialGoods extends Goods {
	public void test(){
		//protected 다른 패키지여도 자식에서 접근 가능하다.
		price = 0 ;
	}
}
