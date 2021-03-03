package SecondDay.Assigment1;

public class Main {
    public static void main(String[] args) {

        int[] firstArray = {8,7,6,5,4};
        int[] secondArray = {5,4,3,8,9};


        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 1; j < secondArray.length; j++) {
                if(firstArray[i] == secondArray[j]){
                    System.out.print("Numbers that duplicate: " + firstArray[i]);
                }
            }
        }
    }
}
