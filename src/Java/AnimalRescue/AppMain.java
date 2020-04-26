package Java.AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        Dog myObject = new Dog();

        System.out.println(myObject.name);
        System.out.println(myObject.age);

        Girl myRescue = new Girl();
        System.out.println(myRescue.name);

        Food myDinner = new Food();
        System.out.println(myDinner.name);

        Doctor mySave = new Doctor();
        System.out.println(mySave.specialization);

        Activity myRecreation = new Activity();
        System.out.println(myRecreation.name);
    }
}
