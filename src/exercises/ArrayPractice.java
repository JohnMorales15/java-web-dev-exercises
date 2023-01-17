package exercises;

import java.util.*;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] array = {1,1,2,3,5,8};
//        for (int i : array){
//            if (i % 2 == 1) {
//                System.out.println(i);
//            }
//        }

        String poem = "I would not, could not, in a box. " +
                "I would not, could not with a fox." +
                "I will not eat them in a house." +
                "I will not eat them with a mouse";


        String[] poemArr = poem.split("\\.");

        System.out.println(Arrays.toString(poemArr));
    }
}
