package pracicaltask23;

public class ExtendedClassMain {
    public static void main(String[] args) {
        ParentClass extendedClass1 = new ExtendedClass((byte) 1, 2, 3.1, "ABC");
        ParentClass extendedClass2 = new ExtendedClass((byte) 1, 3, 3.1, "ABCD");
        ParentClass extendedClass3 = new ExtendedClass((byte) 1, 3, 3.1, "ABCD");
        System.out.println("extendedClass1: " + extendedClass1.toString());
        System.out.println("extendedClass2: " + extendedClass2.toString());
        System.out.println("extendedClass3: " + extendedClass3.toString());
        System.out.println("Equals check:");
        System.out.println("extendedClass1.equals(extendedClass2): " + extendedClass1.equals(extendedClass2)); // false (objects are different(2!=3))
        System.out.println("extendedClass2.equals(extendedClass3): " + extendedClass2.equals(extendedClass3)); // true (objects are equal)
    }
}