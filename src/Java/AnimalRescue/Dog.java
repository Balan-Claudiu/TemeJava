package Java.AnimalRescue;

public abstract class Dog extends Animal{

        public void speak(){
            System.out.println("Wof!");
        }

        @Override
        public void eat() {
            System.out.println("Pedigree");
    }

        @Override
        public void sleep() {
            System.out.println("Sleeps and snores");
    }

}
