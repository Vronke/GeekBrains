package Exp;

public class Treadmill {
    int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    public boolean tryRun(Cat cat){
        cat.run(distance);
        if(cat.getDstance() > distance){
            System.out.println("Кот преодолел препятствие");
            return true;
        }
        System.out.println("Кот не преодолел препятствие");
        return false;
    }
    public boolean tryRun(Robot robot){
        robot.run(distance);
        if(robot.getDistance() > distance){
            System.out.println("Робот преодолел препятствие");
            return true;
        }
        System.out.println("Робот не преодолел препятствие");
        return false;
    }
    public boolean tryRun(Human human){
        human.run(distance);
        if(human.getDistance() > distance){
            System.out.println("Человек преодолел препятствие");
            return true;
        }
        System.out.println("Человек не преодолел препятствие");
        return false;
    }

    public boolean tryRun(Object object){
        if(object.getClass().getCanonicalName().equals("Exp.Human"))
            return tryRun((Human) object);
        if(object.getClass().getCanonicalName().equals("Exp.Robot"))
            return tryRun((Robot) object);
        return tryRun((Cat) object);
    }
}
