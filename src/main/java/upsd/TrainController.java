package upsd;

public class TrainController {

    private int initialPosition;

    public TrainController(int initialPosition) {
        this.initialPosition = initialPosition;
    }

    public String execute(String input) {
        String[] commands = input.split("");

        for (String c : commands) {
            if (c.equals("F")) {
                initialPosition += 1;
            }
            if (c.equals("B")) {
                initialPosition -= 1;
            }
        }

        return String.valueOf(initialPosition);
    }
}
