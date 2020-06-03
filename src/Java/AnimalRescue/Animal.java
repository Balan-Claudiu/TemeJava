package Java.AnimalRescue;

public abstract class Animal {
    private String name;
    private int age ;
    private int hunger ;
    private int mood ;
    private String food ;
    private String play ;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getHunger() {
        return hunger;
    }
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getMood() {
        return mood;
    }
    public void setMood(int mood) {
        this.mood = mood;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getPlay() {
        return play;
    }
    public void setPlay(String play) {
        this.play = play;
    }

    public abstract void eat();
    public abstract void run();
    public abstract void sleep();
    public abstract void speak();
    }



