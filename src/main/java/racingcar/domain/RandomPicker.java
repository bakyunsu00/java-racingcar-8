package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomPicker {


    private static RandomPicker instance;

    private RandomPicker(){}

    public static RandomPicker getInstance(){
        if(instance == null){
            instance = new RandomPicker();
        }
        return instance;
    }

    public int pickRandomNumber(){
        return Randoms.pickNumberInRange(0,9);

    }




}
