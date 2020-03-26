package Exp;

public class Main {

    public static void main(String[] args) {
        Object[] participants = new Object[5];
        participants[0] = new Robot(300, 5000);
        participants[1] = new Cat(150, 500);
        participants[2] = new Human(120, 1000);
        participants[3] = new Cat(140, 800);
        participants[4] = new Human(110, 3000);

        Object[] obstacles = new Object[4];
        obstacles[0] = new Treadmill(700);
        obstacles[1] = new Hurdle(100);
        obstacles[2] = new Treadmill(2000);
        obstacles[3] = new Hurdle(120);

        System.out.println(obstacles[0].getClass().getCanonicalName());

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (obstacles[j].getClass().getCanonicalName().equals("Exp.Hurdle")) {
                    assert obstacles[j] instanceof Hurdle;
                    if (!((Hurdle) obstacles[j]).tryJump(participants[i])) {
                        System.out.println("Полоса с препятствиями провалена");
                        break;
                    }
                }
                if (obstacles[j].getClass().getCanonicalName().equals("Exp.Treadmill")) {
                    assert obstacles[j] instanceof Treadmill;
                    if (!((Treadmill) obstacles[j]).tryRun(participants[i])) {
                        System.out.println("Полоса с препятствиями провалена");
                        break;
                    }
                }
            }
            System.out.println("Полоса с препятствиями пройдена успешно");
        }
    }
}
