import java.util.Scanner;

public class InputView {

    public static final String INPUT_MONEY_MESSAGE = "구입금액을 입력해 주세요.";
    public static final String INPUT_WINNING_LOTTO_MESSAGE = "지난 주 당첨 번호를 입력해 주세요.";

    public static Scanner scanner = new Scanner(System.in);

    public static int inputMoney() {
        System.out.println(INPUT_MONEY_MESSAGE);
        return scanner.nextInt();
    }

    public static String inputWinningLottoNumber() {
        System.out.println(INPUT_WINNING_LOTTO_MESSAGE);
        return scanner.nextLine();
    }
}