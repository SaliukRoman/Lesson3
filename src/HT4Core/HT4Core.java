package HT4Core;

public class HT4Core {
    public static void main(String[] args) {
        Robot firstRobot = new Robot();
        Robot coffeeRobot = new CoffeeRobot();
        Robot robotDancer = new RobotDancer();
        Robot robotCoocker = new RobotCoocker();
        firstRobot.work();
        coffeeRobot.work();
        robotDancer.work();
        robotCoocker.work();
        Robot robots[] = new Robot[]{firstRobot, robotCoocker, robotDancer, coffeeRobot};
        for (Robot robot: robots) {
            robot.work();
        }

    }
}
