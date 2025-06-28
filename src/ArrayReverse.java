public class ArrayReverse {
    public static void main(String[] args) {
        int [] arr={0,2,3,5,67,7};
        int n=arr.length;
        int [] ans= new int[n];
        int j=0;
        for(int i = n-1; i >= 0; i--){
            ans[j++]=arr[i];
        }
        for(int i=0;i< ans.length;i++){
            System.out.print(ans[i]+ " ");
        }
    }
}
