/*Check if pair with given Sum exists in Array
Given an array A[] of n numbers and another number x, the task is to check whether or not there exist two elements in Al] whose sum is exactly x.
Examples:
Input: arrl] = {0, -1, 2, -3, 1}, x= -2
Output: Yes
Explanation: If we calculate the sum of the output, 1 + (-3) = -2
Input: arr] = {1, -2, 1, 0, 5}, x = 0
Output: No*/
public class CheckPairSum {
    static boolean hasPairWithSum(int arr[],int size,int targetval){
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]+arr[j]==targetval){
                    return true;
                }
            }
        }
        return false;

        }

    public static void main(String[] args) {
        int arr[]={0,5,4,3,2,90};
        int targetval=5;
        int size=arr.length;

        if(hasPairWithSum(arr,size,targetval)){
            System.out.println("Yes there is a pair whose sum equals: "+targetval);
        }
        else{
            System.out.println("No such pair exists");
        }

    }
    }
//this program has O(n^2) complexity as it uses two for loops




