public class print2DArray {
    public static void main(String[] args) {
        int[][] arr = {{2,3,4},{6,7,8},{8,7,9}};
        for(int i =0; i<arr.length; i++){
            for(int j=0;j<arr[i].length; j++)
            {
                System.out.println(arr[i][j]);
            }
        }

    }
}
