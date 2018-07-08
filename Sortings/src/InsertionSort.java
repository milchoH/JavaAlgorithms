public class InsertionSort {

    public static void main(String[] args){

        int[] intArray = {-3,20,-4,40,3,17,-150};

        for(int firstUnsorted =1; firstUnsorted < intArray.length; firstUnsorted++ ){
            int newElement = intArray[firstUnsorted];

            int i;
            for (i = firstUnsorted; i > 0 && intArray[i-1] > newElement; i--){
                intArray[i] = intArray[i-1];
            }

            intArray[i] = newElement;

        }
        for(int i =0; i<intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
}
