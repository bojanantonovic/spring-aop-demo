public class Dummy {

    public void foo() {
        System.out.println("This is foo()!");
    }

    void bla() {
        System.out.println("This is bla()!");
    }

    int five() {
        System.out.println("This is five()!");

        return 5;
    }

    void mickey() {
        System.out.println("This is mickey()!");

        throw new RuntimeException("Exception form mickey()!");
    }
}
