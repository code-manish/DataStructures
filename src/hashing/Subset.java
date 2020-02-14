package hashing;

import java.util.HashSet;

public class Subset {
    private static boolean isSubset(int [] array1, int [] array2){
        HashSet<Integer> hashSet = new HashSet<>();
        for (int a: array1) {
            hashSet.add(a);
        }

        for (int a:array2) {
            if(!hashSet.contains(a)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int [] array1 = {11, 1, 13, 21, 3, 7};
        int [] array2 = {11, 3, 7, 1};
        if(isSubset(array1, array2)){
            System.out.println("Arrays2 is a subset of Array1");
        } else {
            System.out.println("Array2 is not a subset of Array1");
        }
    }

}
