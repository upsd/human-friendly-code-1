package upsd;

public class TrainController {

    private int initialPosition;

    public TrainController(int initialPosition) {
        this.initialPosition = initialPosition;
    }

    public String execute(String input) {
        return String.valueOf(initialPosition);
    }
}
