public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        rotate(matrix);
    }
    public static void rotate(int[][] matrix){
        if(matrix.length!=matrix[0].length||matrix.length==0){
            System.out.println("Not Possible");
        }
        int n=matrix.length;
        for (int layer = 0; layer <n/2 ; layer++) {
            int initial=layer;
            int end=n-layer-1;
            for (int j = initial; j <end ; j++) {
                int temp=matrix[layer][j];
                int offset=j-initial;
                matrix[layer][j]=matrix[end-offset][layer];
                matrix[end-offset][layer]=matrix[end][end-offset];
                matrix[end][end-offset]=matrix[layer+offset][end];
                matrix[layer+offset][end]=temp;
            }
        }
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();
        }
    }
}
