import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {

    private static final String INPUT_MONEY_MESSAGE = "구입금액을 입력해 주세요.";
    private static final String INPUT_WINNING_LOTTO_MESSAGE = "지난 주 당첨 번호를 입력해 주세요.";
    private static final String MANUAL_LOTTO_COUNT_MESSAGE = "수동으로 구매할 로또 수를 입력해 주세요.";
    private static final String MANUAL_LOTTO_NUMBER_MESSAGE = "수동으로 구매할 번호를 입력해 주세요.";

    private static final String INPUT_BONUS_NUMBER_MESSAGE = "보너스 볼을 입력해 주세요.";

    private static Scanner scanner = new Scanner(System.in);

    public static int inputMoney() {
        System.out.println(INPUT_MONEY_MESSAGE);
        return Integer.parseInt(scanner.nextLine());
    }

    public static int manualLottoCount() {
        System.out.println(MANUAL_LOTTO_COUNT_MESSAGE);
        return Integer.parseInt(scanner.nextLine());
    }

    public static List<Lotto> manualLotto(int manualLottoCount) {
        List<Lotto> manualLotto = new ArrayList<>();

         System.out.println(MANUAL_LOTTO_NUMBER_MESSAGE);

        for (int i = 0; i < manualLottoCount; i++) {
            String inputs = scanner.nextLine();
//            if (i != manualLottoCount - 1) {scanner.nextLine();}
            System.out.println(inputs);
            List<LottoNumber> lottoNumbers = StringParsingUtils.parseToLottoNumber(inputs);
            manualLotto.add(new Lotto(lottoNumbers));
        }
        return manualLotto;
    }

    public static BonusNumber inputBonusNumber() {
        System.out.println(INPUT_BONUS_NUMBER_MESSAGE);
        int bonusNumber = Integer.parseInt(scanner.nextLine());
        return new BonusNumber(new LottoNumber(bonusNumber));
    }

    public static String inputWinningLottoNumber() {
        System.out.println(INPUT_WINNING_LOTTO_MESSAGE);
        return scanner.nextLine();
    }
}