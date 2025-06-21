public class CheckPairSum2 {
    static boolean hasPairwithSum(int arr[],int size,int targetSum){
        //find the maximum and minimum value in the array
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<size;i++){
            //update max if the current element is greater
            if(arr[i]>max){
                max=arr[i];
            }
            //update min if the current element is smaller
            if(arr[i]<min){
                min=arr[i];
            }
        }
        //create a boolean array to keep track of visited elements
        boolean[] visited=new boolean[max-min+1];
        for(int i=0;i<size;i++){
            int compliment=targetSum-arr[i];
            //if the compliment falls within the valid range and been visited then we will mark true
            if(compliment>=min && compliment<=max && visited[compliment-min]){
                return true;
            }
            visited[arr[i]-min]=true;
        }
        return false;

    }
    public static void main(String[] args){
        int arr[]={0,8,-5,3,7,2};
        int targetSum=2;
        int size=arr.length;

        if(hasPairwithSum(arr, size, targetSum)){
            System.out.println("Yes , there exist a pair with the sum :" + targetSum);
        }
        else{
            System.out.println("No , there exist no pair with the sum :" + targetSum);
        }
    }
}
