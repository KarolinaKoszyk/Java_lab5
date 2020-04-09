package Zadanie2;

import Zadanie4.MyException;

import java.util.Collections;
import java.util.List;


public class Solution {
    int solution(List<Integer> list) throws MyException {
        if (list.size() > 100000 || list.isEmpty() == true){
            throw new MyException();
        }

        Collections.sort(list);
        int res=0;
        if (list.get(0) > 1){
            res = 1;
        }
        else {
            for (int i = 1; i < list.size(); i++) {
                int smaller = list.get(i - 1);
                int bigger = list.get(i);
                int possible_sollution = smaller + 1;

                if (possible_sollution == bigger) {
                    continue;
                }
                if (possible_sollution < 1) {
                    continue;
                }
                res = possible_sollution;
            }
        }

        if (res == 0){
            int i = list.size();
            res = Math.max(list.get(i-2)+2 , 1);
        }
        return res;
    }

}