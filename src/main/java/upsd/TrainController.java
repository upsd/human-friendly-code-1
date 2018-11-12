package upsd;

public class TrainController {

    private int initialPosition;

    public TrainController(int initialPosition) {
        this.initialPosition = initialPosition;
    }

    public String execute(String input) {
        if (input.equals("F")) {
            return String.valueOf(initialPosition + 1);
        }
        return String.valueOf(initialPosition);
    }
}
