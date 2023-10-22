package baseball.model;

import java.util.List;

public class BallStrikeCounter {
    private Integer ball;
    private Integer strike;

    public BallStrikeCounter() {
        this.resetBallStrike();
    }

    public void countBallStrike(List<Integer> userNumber, List<Integer> computerNumber) {
        for (int i = 0; i < userNumber.size(); i++) {
            if (userNumber == computerNumber) {
                this.strike = 3;
                break;
            }

            if (userNumber.get(i).equals(computerNumber.get(i))) {
                this.strike++;
            } else if (computerNumber.contains(userNumber.get(i))) {
                this.ball++;
            }
        }
    }

    public void resetBallStrike() {
        this.ball = 0;
        this.strike = 0;
    }

    public boolean isThreeStrike() {
        return this.strike == 3;
    }

    @Override
    public String toString() {

        if (ball > 0 && strike > 0) {
            return this.ball + "볼 " + this.strike + "스트라이크";
        } else if (ball == 0 && strike > 0) {
            return this.strike + "스트라이크";
        } else if (ball > 0 && strike == 0) {
            return this.ball + "볼";
        }

        return "낫싱";
    }
}
