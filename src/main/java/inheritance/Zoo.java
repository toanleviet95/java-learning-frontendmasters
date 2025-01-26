package inheritance;

public class Zoo {
    public static void main(String[] args) {
        Dog rocky = new Dog();
//        rocky.fetch();
//        rocky.makeSound();
//        feed(rocky);
        Animal sasha = new Dog();
//        sasha.makeSound();
        feed(sasha);
        sasha = new Cat();
        feed(sasha);
//        sasha.makeSound();
//        ((Cat)sasha).scratch();
//
        boolean isDog = sasha instanceof Dog;
        System.out.println("Is Dog: " + isDog);

        if (sasha instanceof Cat sashaTheCat) {
            sashaTheCat.scratch();
        }

        // above code is shorthand same as
        if (sasha instanceof Cat) {
            Cat sashaTheCat = (Cat)sasha;
            sashaTheCat.scratch();
        }
    }

    public static void feed(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("Here is your dog food");
        }
        if (animal instanceof Cat) {
            System.out.println("Here is your cat food");
        }
    }
}
