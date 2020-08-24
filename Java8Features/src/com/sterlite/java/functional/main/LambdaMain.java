package com.sterlite.java.functional.main;

import java.time.LocalDate;

import com.sterlite.java.functional.Addable;
import com.sterlite.java.functional.Greeting;
import com.sterlite.java.functional.Movable;
/**
 * @author dharmaraj.pawale@sterlite.com
 * @creation_date 10 Aug 2020
 * @copyright Sterlite Tech. Ltd.
 *
 */
public class LambdaMain {
	
	public static void addDemo(Addable ob) {
		System.out.println(ob.add(45, 34));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Movable m = ()->System.out.println("Some object is moving")     ;
		m.move();
		
		// Full Form of lambda expression
		Greeting g = (int b)->{return "Good Afternoon! "+b;};
		System.out.println(g.sayGreet(10));
		
		// Short form of lambda expression
		g = c->"Good Eve! "+c;
		System.out.println(g.sayGreet(30));
		
					 // Full Form of lambda expression
		Addable ob = (int x,int y)-> {return x + y;}   ;
		addDemo(ob);
	
		
		int res = ob.add(10, 20);
		System.out.println(res);
		System.out.println(ob.add(1000,2000));
		
			// Short form of lambda expression
		ob = (c,d)->c+d;
		System.out.println(ob.add(100, 200));
		
		System.out.println(ob.addFloats(12.4f, 20.0f));
		
		System.out.println(Addable.show());
	}
}
