package lecture01;

public class kadai14 {
    public static void main(String[] args) {
        int sum = 0;
        int [] array = new int [100];
        for(int i = 0; i < 100; i++){
            array[i] = i + 1;

        }
        for(int j = 0; j < 100; j++){
            if(j % 2 == 0){
                sum = sum + array[j + 1];
            }

        }

        System.out.println(sum);
    }
}
