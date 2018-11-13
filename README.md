# Human Friendly Code #1 - Train Controller
This project demonstrates refactoring code so it is much easier for humans (developers) to understand and make changes
to if required.

## The scenario
The program is built to simulate commands being sent to a train, and reporting the position on the track after doing so.

* Trains have an initial position (e.g. "0")
* Trains can move forwards and backwards:
    * "F" - Forwards
    * "B" - Backwards
    

`Given` a train is at position "2"

`When` a train is sent "FFB"

`Then` the train is at position "3"

## How it was refactored
See [this branch](https://github.com/upsd/human-friendly-code-1/tree/original-code) for how an original solution was
reached, and how it was refactored into a much more human-friendly solution.

Take a look at the [commits](https://github.com/upsd/human-friendly-code-1/commits/master) for more detail on the steps
taken to refactor the original solution.

N.B. You cannot change the public interface of this code. Any refactoring must not change the observable behaviour of
the code.