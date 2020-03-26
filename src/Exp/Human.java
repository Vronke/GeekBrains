package Exp;

public class Human {
    int bounce;
    int distance;

    Human(int bounce, int distance){
        this.bounce = bounce;
        this.distance = distance;
    }

    public int getBounce() {
        return bounce;
    }

    public int getDistance() {
        return distance;
    }

    public void run(int distance){
        if (this.distance < distance)
            System.out.println("Человек пробежал " + this.distance + "м");
        else
            System.out.println("Человек пробежал " + distance + "м");
    }

    public void jump(int bounce){
        if (this.bounce < bounce)
            System.out.println("Человек прыгнул на " + this.bounce + "см");
        else
            System.out.println("Человек прыгнул на " + bounce + "см");
    }
}
