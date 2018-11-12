package upsd;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

class TrainControllerShould {

    @ParameterizedTest
    @CsvSource({
            "1, '', 1",
            "2, '', 2"
    })
    void move_train(int initialPosition, String input, String expectedPosition) {
        TrainController controller = new TrainController(initialPosition);


        String newPosition = controller.execute(input);


        assertThat(newPosition, is(expectedPosition));
    }
}
