public class arraymax {
    public static void main(String[] args) {
        int arr[]={1,2,33,44,33,56,43,67,58,69};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] >= max){
                max=arr[i];
            }
        }
        System.out.println(max);

    }

}
