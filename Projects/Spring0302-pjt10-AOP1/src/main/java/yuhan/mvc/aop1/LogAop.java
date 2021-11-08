package yuhan.mvc.aop1;

import org.aspectj.lang.ProceedingJoinPoint;

// ����, �� ���μ��� Ÿ�� üũ�ϴ� AOP Class
public class LogAop {
	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable {
		String signatureStr = joinPoint.getSignature().toShortString();	// getSignature() : � �޼ҵ带 ȣ���� �� �ش� �޼ҵ��� ������ ������ �޼ҵ�
		
		System.out.println(signatureStr + "is Start");
		
		long start = System.currentTimeMillis();	// currentTimeMillis() : 100������ 1�ʸ� ���
		
		try {
			Object object = joinPoint.proceed();
			return object;
		} finally {
			long end = System.currentTimeMillis();
			System.out.println(signatureStr + "is Finished");
			System.out.println(signatureStr + " ����ð� : " + (end - start));
		}

	}
}
