package baseball.view;

public class OutputView {
    public static void gameStartMessage() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public static void userInputMessage() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    public static void printBallStrike(String result) {
        System.out.println(result);
    }

    public static void printCelebrate() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
}
