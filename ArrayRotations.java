public class ArrayRotations {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8};
        rotation(nums,3,8); //Rotating an array of length by 3 steps to left
        for(int i:nums) System.out.print(i+" ");
    }
    public static void rotation(int[] nums,int d,int n){
        int move=GCD(d,n),j,k;
        for (int i = 0; i <move ; i++) {
            int temp=nums[i];
            j=i;
            while(true){
                k=j+move;
                if(k>=n)
                    k=k-n;
                if(k==i)
                    break;
                nums[j]=nums[k];
                j=k;
            }
            nums[j]=temp;
        }

    }
    public static int GCD(int a,int b){
        int res=1;
        for(int i=2;i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0){
                res=res*i;
            }
        }
        return res;
    }
}
