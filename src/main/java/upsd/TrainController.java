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
            if (c.equals(FORWARD)) {
                position += 1;
            }
            if (c.equals(BACKWARD)) {
                position -= 1;
            }
        }

        return String.valueOf(position);
    }
}
