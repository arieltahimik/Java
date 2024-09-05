public class Main {
    public static void main(String[] args) {
        System.out.print("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        Person personA = new Person("Matt",23);
        Person personB = new Person("Meg",22);

        personA.Introduce();
        personB.Introduce();
    }
}