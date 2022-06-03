import exception.LottoIsNotUniqueException;
import exception.LottoSizeMismatchException;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lotto {
    public static final int LOTTO_SIZE = 6;
    public static final String LOTTO_SIZE_IS_NOT_6 = "로또 크기가 6이 아닙니다.";
    public static final String LOTTO_IS_NOT_UNIQUE = "중복되는 로또 번호가 있습니다";
    private List<LottoNumber> lotto;

    public Lotto(List<LottoNumber> lotto) {
        validateLottoSize(lotto);
        validateLottoIsUnique(lotto);
        this.lotto = lotto;
    }

    private void validateLottoSize(List<LottoNumber> lotto) {

        if (lotto.size() != LOTTO_SIZE)
            throw new LottoSizeMismatchException(LOTTO_SIZE_IS_NOT_6);
    }
    
    private void validateLottoIsUnique(List<LottoNumber> lotto) {
        Set<LottoNumber> lottoNumberSet = new HashSet<>(lotto);

        if (lottoNumberSet.size() != LOTTO_SIZE) {
            throw new LottoIsNotUniqueException(LOTTO_IS_NOT_UNIQUE);
        }
    }

    public int getLottoSize() {
        return lotto.size();
    }

    public List<LottoNumber> getLotto() {
        return lotto;
    }
}
