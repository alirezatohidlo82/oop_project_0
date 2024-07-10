import Controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.addDefaultCardToController();
        controller.addSpecialCards();
        controller.addDefaultCharacter();
        controller.run();
    }
}