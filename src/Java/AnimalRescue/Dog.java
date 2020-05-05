package Java.AnimalRescue;

public class Dog {

    private String name ;
    private int age ;
    private int hunger ;
    private int mood ;
    private String food ;
    private String play ;

   public String getName(){
       return name;
   }
   public void setName(String name){
       this.name = name;
   }

   public int getAge(){
       return age;
   }
   public void setAge(int age){
       this.age = age;
   }

   public int getHunger(){
       return hunger;
   }
   public void setHunger(int hunger){
       this.hunger = hunger;
   }

   public int getMood(){
       return mood;
   }
   public void setMood(int mood){
       this.mood = mood;
   }

   public String getFood(){
       return food;
   }
   public void setFood(String food){
       this.food = food;
   }
   public String getPlay(){
       return play;
   }
   public void setPlay(String play){
       this.play = play;
   }


    public void eat(){
        System.out.println("Eating...");
    }
    public void run(){
        System.out.println("Runing...");
    }
    public void speel(){
        System.out.println("zzzZZZzzz");
    }
}
