import java.util.Scanner;
public class ArraySum{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int[] arr = {3, 7, 5, 4, 2};
        int sum=0;
        for(int i =0; i< arr.length; i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
