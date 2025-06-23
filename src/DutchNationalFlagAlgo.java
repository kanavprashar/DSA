/* an array of size N containing only Os, 1s, and 2s; sort the array in ascending order.
Example 1:
Input:
N =5
arrl= {0 2 1 2 0} Output:
00122
Explanation:
Os 1s and 2s are segregated into ascending order.
Example 2:
Input:
N = 3
arrl = {0 1 0}
Output:
001
Explanation:
Os 1s and 2s are segregated into ascending order.*/
public class DutchNationalFlagAlgo {
    static void SortArray(int arr[],int n){
        int low=0;//pointer for o
        int mid=1;//pointer for 1
        int high=n-1;//pointer for 2

        while(mid<=high){
            switch(arr[mid]){
                case 0://switch low w mid
                    int temp=arr[low];
                    arr[low]=arr[mid];
                    arr[mid]=temp;

                    low++;
                    mid++;
                    break;
                case 1://move mid pointer to next element
                    mid++;
                    break;
                case 2://switch mid w high
                    temp=arr[mid];
                    arr[mid]=arr[high];
                    arr[high]=temp;

                    high--;
                    break;


            }
        }
    }

    public static void main(String[] args) {
        int arr[]={0,2,0,1,2,1,2,0};
        int n=arr.length;

        SortArray(arr,n);

        for(int i=0;i<n;i++){
            System.out.println(arr[i]+ " ");
        }
    }
}
