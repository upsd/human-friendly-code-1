package upsd;

public class TrainController {

    private final int ONE_MILE = 1;
    private final String BACKWARD = "B";
    private final String FORWARD = "F";
    private int position;

    public TrainController(int initialPosition) {
        this.position = initialPosition;
    }

    public String execute(String input) {

        for (String c : commandsFrom(input)) {
            move(c);
        }

        return String.valueOf(position);
    }

    private String[] commandsFrom(String input) {
        return input.split("");
    }

    private void move(String command) {
        if (command.equals(FORWARD)) {
            moveBy(ONE_MILE);
        }

        if (command.equals(BACKWARD)) {
            moveBy(-ONE_MILE);
        }
    }

    private void moveBy(int miles) {
        position += miles;
    }
}
