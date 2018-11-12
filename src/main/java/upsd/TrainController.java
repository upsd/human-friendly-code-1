package upsd;

public class TrainController {

    private final String BACKWARD = "B";
    private final String FORWARD = "F";
    private int position;

    public TrainController(int initialPosition) {
        this.position = initialPosition;
    }

    public String execute(String input) {
        String[] commands = input.split("");

        for (String c : commands) {
            move(c);
        }

        return String.valueOf(position);
    }

    private void move(String command) {
        if (command.equals(FORWARD)) {
            moveBy(1);
        }

        if (command.equals(BACKWARD)) {
            moveBy(-1);
        }
    }

    private void moveBy(int space) {
        position += space;
    }
}
