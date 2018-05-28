package com.kodilla.testing.collection;
import java.util.ArrayList;
import java.util.List;


public class OddNumbersExterminator {

    public List<Integer> printEven(List<Integer> theList){
        Integer temporaryValue = 0;
        List<Integer>theListEven= new ArrayList<>();
        for (Integer n=0; n < theList.size(); n++){
            temporaryValue = theList.get(n);
              if (temporaryValue % 2 == 0){


               theListEven.add(temporaryValue);

            }

            }

            return theListEven;
    }
}










