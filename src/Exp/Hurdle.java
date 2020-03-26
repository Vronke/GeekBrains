package Exp;

public class Hurdle {
    int height;

    public Hurdle(int height) {
        this.height = height;
    }

    public boolean tryJump(Cat cat){
        cat.jump(height);
        if(cat.getBounce() > height){
            System.out.println("Кот преодолел препятствие");
            return true;
        }
        System.out.println("Кот не преодолел препятствие");
        return false;
    }
    public boolean tryJump(Robot robot){
        robot.jump(height);
        if(robot.getBounce() > height){
            System.out.println("Робот преодолел препятствие");
            return true;
        }
        System.out.println("Робот не преодолел препятствие");
        return false;
    }
    public boolean tryJump(Human human){
        human.jump(height);
        if(human.getBounce() > height){
            System.out.println("Человек преодолел препятствие");
            return true;
        }
        System.out.println("Человек не преодолел препятствие");
        return false;
    }

    public boolean tryJump(Object object){
        if(object.getClass().getCanonicalName().equals("Exp.Human"))
            return tryJump((Human) object);
        if(object.getClass().getCanonicalName().equals("Exp.Robot"))
            return tryJump((Robot) object);
        return tryJump((Cat) object);
    }
}
