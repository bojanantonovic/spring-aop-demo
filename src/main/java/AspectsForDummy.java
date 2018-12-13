import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AspectsForDummy {

    @Before("PointcutsForDummy.eachFoo()")
    public void beforeEachFoo() {
        System.out.println("beforeEachFoo()");
    }

    @AfterReturning("PointcutsForDummy.eachFoo()")
    public void after() {
        System.out.println("after()");
    }

    @Before("PointcutsForDummy.eachPublicMethodInEachClass()")
    public void beforePublic() {
        System.out.println("beforePublic()");
    }

    @Before("PointcutsForDummy.eachMethodOfDummy()")
    public void beforeEachMethod() {
        System.out.println("beforeEachMethod()");
    }

    @Around("PointcutsForDummy.eachMethodOfDummy()")
    public Object aroundEachMethod(ProceedingJoinPoint pjp) throws Throwable {
        Object value = pjp.proceed();
        System.out.println("aroundEachMethod(): returned value: " + value);

        return value;
    }

    @AfterThrowing(
            pointcut="PointcutsForDummy.eachMethodOfDummy()",
            throwing="e")
    public void afterThrowing(Exception e) {
        System.out.println(e);
    }
}
