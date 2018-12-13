import org.aspectj.lang.annotation.Pointcut;

public class PointcutsForDummy {

    @Pointcut("execution(* foo(..))")
    public void eachFoo() {
    }

    @Pointcut("execution(public * *(..))")
    public void eachPublicMethodInEachClass() {
    }

    @Pointcut("execution(* Dummy.*(..))")
    public void eachMethodOfDummy() {
    }
}
