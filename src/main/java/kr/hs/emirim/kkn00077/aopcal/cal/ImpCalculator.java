package kr.hs.emirim.kkn00077.aopcal.cal;

public class ImpCalculator implements Calculator {

		@Override
		public long factorial(long num) {
			long start =System.currentTimeMillis();
			long result = 1;
			for (long i = 1; i <= num; i++) {
				result *= i;
			}
			long end=System.currentTimeMillis();
			System.out.printf("Imp factorial(%d) : 실행시간 = %d\n",num,(end-start));
			return result;
		}
	}