public class InsertionSort {
    public static void main(String[] args) {
        int []number={5,2,1,6,4};
        for(int i=1;i<number.length;i++){
            int current=number[i];
            int j=i-1;
            while(j>=0 && current<number[j]){
                number[j+1]=number[j];
                j--;
            }
            number[j+1]=current;
        }

        for(int i=0;i<number.length ;i++){
            System.out.print(number[i]+" ");
        }
    }
}
