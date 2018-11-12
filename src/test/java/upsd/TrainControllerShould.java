package upsd;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

class TrainControllerShould {

    @ParameterizedTest
    @CsvSource({
            "1, '', 1",
            "2, '', 2",
            "1, 'F', 2",
            "3, 'F', 4",
            "2, 'FF', 4",
            "3, 'FFF', 6",
            "2, 'B', 1",
            "4, 'BB', 2",
            "5, 'BBB', 2"
    })
    void move_train(int initialPosition, String input, String expectedPosition) {
        TrainController controller = new TrainController(initialPosition);


        String newPosition = controller.execute(input);


        assertThat(newPosition, is(expectedPosition));
    }
}
