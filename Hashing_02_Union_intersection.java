import java.util.HashSet;

public class Hashing_02_Union_intersection {
    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};

        HashSet <Integer> set = new HashSet<>();
        for(int i = 0; i < arr1.length; i++){
            set.add(arr1[i]);
        }
        HashSet <Integer> setTemp = new HashSet<>();
        for(int i = 0; i < arr2.length; i++){
            if(set.contains(arr2[i])){
                setTemp.add(arr2[i]);
            }
        }
        System.out.println("Intersection : " + setTemp);

        for(int i = 0; i < arr2.length; i++){
            set.add(arr2[i]);
        }


        System.out.println("Union : " + set);

        
        
    }
}
