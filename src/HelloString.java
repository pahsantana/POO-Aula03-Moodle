public class HelloString {
    public static void main(String[] args) {
        // declaration - estatica
        String s;
        // instantiation / creation - dinamica
        s = new String("Hello World!");

        char c = s.charAt(4);

        System.out.println(System.identityHashCode(s));
    }
}
