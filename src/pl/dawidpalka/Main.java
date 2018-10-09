package pl.dawidpalka;

public class Main {

    public static void main(String[] args) {

        int[] array = {1,2,3,1,2,3,6};
        int[] sequence = {1,2,3};
        int counter = 0;

        for (int number : array) {
            if(number == sequence[counter]){
                if(counter == sequence.length-1){
                    System.out.println(true);
                    break;
                }
                counter++;
            }else{
                counter = 0;
            }
        }

    }
}
