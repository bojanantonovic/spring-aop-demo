import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AspectsForFoo {

    @Before("PointcutsForFoo.executionOfFoo()")
    public void before() {
        System.out.println("before()");
    }

    @AfterReturning("PointcutsForFoo.executionOfFoo()")
    public void after() {
        System.out.println("after()");
    }

    @Before("PointcutsForFoo.eachPublicMethod()")
    public void beforePublic() {
        System.out.println("beforePublic()");
    }

    @Before("PointcutsForFoo.eachMethodOfFoo()")
    public void beforeEachMethod() {
        System.out.println("beforeEachMethod()");
    }

    @Around("PointcutsForFoo.eachMethodOfFoo()")
    public Object aroundEachMethod(ProceedingJoinPoint pjp) throws Throwable {
        Object value = pjp.proceed();
        System.out.println("aroundEachMetho(): returned value: " + value);

        return value;
    }
}
