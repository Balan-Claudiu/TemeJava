package Java.AnimalRescue;

public class AppMain2 {
    public static void main(String[] args) {

        Dog rex = new Dog();

        rex.setName("Rex");
        rex.setAge(5);
        rex.setHunger(3);
        rex.setMood(1);
        rex.setFood("Meat");
        rex.setPlay("Ball");


        System.out.println(rex.getName());
        System.out.println(rex.getAge());
        System.out.println(rex.getHunger());
        System.out.println(rex.getMood());
        System.out.println(rex.getFood());
        System.out.println(rex.getPlay());


        Food bones = new Food();

        bones.setName("Bones");
        bones.setPrice(20);
        bones.setAmount(10);
        bones.setStock(3);

        System.out.println(bones.getName());
        System.out.println(bones.getPrice());
        System.out.println(bones.getAmount());
        System.out.println(bones.getStock());

        Girl ana = new Girl();

        ana.setName("Ana");
        ana.setBani(500);

        System.out.println(ana.getName());
        System.out.println(ana.getBani());

        Doctor andrei = new Doctor();

        andrei.setName("Andrei");
        andrei.setSpecialization("Vet");

        System.out.println(andrei.getName());
        System.out.println(andrei.getSpecialization());

        Activity playWithBall = new Activity();
        playWithBall.setName("PlayWithBall");

        System.out.println(playWithBall.getName());
    }
}
