/*find the unique no in the array where all the nos are being repeated twice but one unique no is repeated only once
the simpple logic for this program is that forst traveser the array using 2 loops if two nos are equal in array then it means that no is repeated twice,mark them both as -1,the unique no will have a count of >0 as it is present atleast once.
*/
public class arraypatterns {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 1, 3, 2, 4, 4, 0};

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                    break;
                }
            }
        }

        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                ans = arr[i];
                break;
            }
        }

        System.out.println(ans);
    }
}
