import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String... args) {

        try (final var context = new AnnotationConfigApplicationContext(MyConfiguration.class, Dummy.class, PointcutsForDummy.class, AspectsForDummy.class)) {
            final var dummy = context.getBean(Dummy.class);

            dummy.foo();
            System.out.println();

            dummy.bla();
            System.out.println();

            dummy.five();
            System.out.println();
        }

    }
}
