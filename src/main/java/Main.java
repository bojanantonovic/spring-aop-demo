import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String... args) {

        try (final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class, Dummy.class, PointcutsForFoo.class, AspectsForFoo.class)) {
            final Dummy dummy = context.getBean(Dummy.class);
            dummy.foo();
            System.out.println();

            dummy.bla();
            System.out.println();

            dummy.moo();
            System.out.println();
        }

    }
}
