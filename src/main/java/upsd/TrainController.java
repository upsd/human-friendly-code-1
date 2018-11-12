package upsd;

public class TrainController {

    private final String BACKWARD = "B";
    private final String FORWARD = "F";
    private int initialPosition;

    public TrainController(int initialPosition) {
        this.initialPosition = initialPosition;
    }

    public String execute(String input) {
        String[] commands = input.split("");

        for (String c : commands) {
            if (c.equals(FORWARD)) {
                initialPosition += 1;
            }
            if (c.equals(BACKWARD)) {
                initialPosition -= 1;
            }
        }

        return String.valueOf(initialPosition);
    }
}
