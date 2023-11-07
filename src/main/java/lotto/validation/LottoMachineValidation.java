package lotto.validation;

import static lotto.constant.Message.LOTTO_PRICE;

public class LottoMachineValidation {

    public void validate_inputMoney(String inputMoney){
        validate_isInputValue(inputMoney);
        validate_isPositiveNum(inputMoney);
        validate_isExactlyDividedByPrice(Integer.parseInt(inputMoney));
    }

    private void validate_isInputValue(String input){
        if(input == null || input.isBlank()){
            throw new IllegalArgumentException();
        }
    }

    private void validate_isPositiveNum(String input){
        int num;
        try {
            num = Integer.parseInt(input);
        }catch (NumberFormatException numberFormatException){
            throw new IllegalArgumentException();
        }

        if(num < 0){
            throw new IllegalArgumentException();
        }
    }

    private void validate_isExactlyDividedByPrice(int input){
        if(input % LOTTO_PRICE != 0){
            throw new IllegalArgumentException();
        }
    }

}
