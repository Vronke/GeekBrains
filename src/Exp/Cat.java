package Exp;

public class Cat {
    int bounce;
    int distance;

    Cat(int bounce, int distance){
        this.bounce = bounce;
        this.distance = distance;
    }

    public int getBounce() {
        return bounce;
    }

    public int getDstance() {
        return distance;
    }

    public void run(int distance){
        if (this.distance < distance)
            System.out.println("Кот пробежал " + this.distance + "м");
        else
            System.out.println("Кот пробежал " + distance + "м");
    }

    public void jump(int bounce){
        if (this.bounce < bounce)
            System.out.println("Кот прыгнул на " + this.bounce + "см");
        else
            System.out.println("Кот прыгнул на " + bounce + "см");
    }
}
