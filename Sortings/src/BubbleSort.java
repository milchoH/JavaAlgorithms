public class BubbleSort {

    public static void main(String[] args){

        int[] intArray = {-3,20,-4,40,3,17,-150};

        for(int lastUnsorted = intArray.length-1; lastUnsorted>0; lastUnsorted--){

            for (int i = 0; i < lastUnsorted; i++){
                if(intArray[i] > intArray[i+1]){
                    swap(intArray, i, i+1);
                }
            }
        }
        for(int i =0; i<intArray.length; i++){
            System.out.println(intArray[i]);
        }

    }

    public static void swap(int[] array, int i, int j){

        if(i == j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }


}