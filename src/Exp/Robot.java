package Exp;

public class Robot {
    int bounce;
    int distance;

    Robot(int bounce, int distance){
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
            System.out.println("Робот пробежал " + this.distance + "м");
        else
            System.out.println("Робот пробежал " + distance + "м");
    }

    public void jump(int bounce){
        if (this.bounce < bounce)
            System.out.println("Робот прыгнул на " + this.bounce + "см");
        else
            System.out.println("Робот прыгнул на " + bounce + "см");
    }
}
