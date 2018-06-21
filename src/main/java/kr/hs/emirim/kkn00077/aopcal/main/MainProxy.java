package kr.hs.emirim.kkn00077.aopcal.main;

import kr.hs.emirim.kkn00077.aopcal.cal.ExeTimeCalculater;
import kr.hs.emirim.kkn00077.aopcal.cal.ImpCalculator;
import kr.hs.emirim.kkn00077.aopcal.cal.RecCalculator;

public class MainProxy {

	public static void main(String[] args) {
		int num=20;
		ExeTimeCalculater ttCal1 = new ExeTimeCalculater(new ImpCalculator());
		System.out.println(ttCal1.factorial(num));
		
		ExeTimeCalculater ttCal2 = new ExeTimeCalculater(new RecCalculator());
		System.out.println(ttCal2.factorial(num));

	}

}
