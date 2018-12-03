import org.aspectj.lang.annotation.Pointcut;

public class PointcutsForFoo {

    @Pointcut("execution(* foo(..))")
    public void executionOfFoo() {
    }

    @Pointcut("execution(public * *(..))")
    public void eachPublicMethod() {
    }

    @Pointcut("execution(* Dummy.*(..))")
    public void eachMethodOfFoo() {
    }
}
