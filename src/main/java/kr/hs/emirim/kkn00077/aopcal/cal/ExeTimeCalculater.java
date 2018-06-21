package kr.hs.emirim.kkn00077.aopcal.cal;

public class ExeTimeCalculater implements Calculator { //프록시 객체 == 대행자
	private Calculator delegate;						//관리하기가 쉬워짐

	public ExeTimeCalculater(Calculator delegate) {
		this.delegate = delegate;
	}

	@Override
	public long factorial(long num) {
		long start = System.nanoTime();
		long result = delegate.factorial(num);
		long end = System.nanoTime();
		System.out.printf("%s.factorial(%d) 실행 시간 = %d\n",
				delegate.getClass().getSimpleName(),
				num, (end - start));
		return result;
	}
}
