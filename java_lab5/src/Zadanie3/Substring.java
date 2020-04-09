package Zadanie3;

import Zadanie4.MyException;

public class Substring {
    private int number = 1;

    private void checking (String a, String b) throws MyException {
        System.out.println(a);

        int l=0;
        for(int i=0; i<b.length(); i++){
            if(!(a.contains(b.substring(i,i+1)))){
                l++;
            }
        }
        if (l>0){
            throw new MyException();
        }
    }

    public int substring (String a, String b) throws MyException {
        checking(a,b);
        while (a.contains(b) == false) {
            a = a + a;
            number++;
        }

        System.out.println(b + "\n" + number + "\n");
        return number;
    }
}

