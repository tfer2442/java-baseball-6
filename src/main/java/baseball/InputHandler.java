package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class InputHandler {

    public List<Integer> inputNumber(){
        System.out.print("숫자를 입력해주세요 : " );
        String str = Console.readLine();
        isValidNumber(str);
        List<Integer> threeNumList = StringManipulator.strToArrayList(str);
        return threeNumList;
    }

    private void isValidNumber(String str) {
        if (str.length() != 3) {
            throw new IllegalArgumentException("입력한 값이 3자리가 아닙니다");
        }
        if (!str.matches("^[1-9]*$")){
            throw new IllegalArgumentException("입력한 값이 숫자가 아닙니다");
        }
        if (StringManipulator.hasDuplicates(str)){
            throw new IllegalArgumentException("중복된 숫자를 입력하였습니다.");
        }

    }


}
