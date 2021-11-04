package com.company;

public class MyInteger {
    private int value;


    public MyInteger(int value){
        this.value = value;
    }

    int getValue(){
        return value;
    }

    boolean isEven(){
        return ((value % 2) == 0);
    }

    boolean isOdd(){
        return ((value % 2) == 1);
    }

    boolean isPrime(){
        if (value <= 1)
            return false;

        for (int i = 2; i < value; i++)
            if (value % i == 0)
                return false;
        return true;
    }

    boolean equals(int value){
       return (this.value == value);
    }

    boolean equals(MyInteger MyInteger){
        return (this.value == MyInteger.value);
    }
}
