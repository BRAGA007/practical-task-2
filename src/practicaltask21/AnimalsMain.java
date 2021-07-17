package practicaltask21;

public class AnimalsMain {
    public static void main(String[] args) {
        Voice cat = new Cat();
        Voice dog = new Dog();
        Voice cow = new Cow();

        cat.voice();
        dog.voice();
        cow.voice();
    }
}