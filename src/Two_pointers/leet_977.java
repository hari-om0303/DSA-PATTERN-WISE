package Two_pointers;

import java.util.Arrays;

public class leet_977 {
    public int [] squareofelement(int [] arr){
        int n = arr.length;

        int negCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) negCount++;
        }

        int [] arr1 = new int[negCount];
        int [] arr2 = new int[n-negCount] ;
        int i1 = 0 ;
        int i2 = 0 ;
        for (int i=0 ; i<n; i++){
            if (arr[i]<0){
                arr1[i1++] = arr[i];
            }else {
                arr2[i2++] = arr[i];
            }
        }

        for (int i=0 ; i< arr1.length ; i++){
            arr1[i] = arr1[i]*arr1[i];
        }
        for (int j=0 ; j< arr2.length ; j++){
            arr2[j] = arr2[j]*arr2[j];
        }

        int result [] = new int[n];
        int i = arr1.length-1;
        int j = 0;
        int k = 0; //result index
        while (i>=0 && j<arr2.length){
            if (arr1[i] <= arr2[j]){
                result[k] = arr1[i];
                k++;
                i--;
            }else {
                result[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i>=0){
            result[k] = arr1[i];
            k++;
            i--;
        }
        while (j< arr2.length){
            result[k] = arr2[j];
            k++;
            j++;
        }
        return result;
    }

    public static void main(String[] args) {
        leet_977 obj = new leet_977();
        int [] nums = {-4,-2,0,1,4,6};
        int [] ans = obj.squareofelement(nums);
        System.out.println(Arrays.toString(ans));
    }
}
